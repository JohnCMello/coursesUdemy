(function () {
  'use strict'

  function DOM(element) {
    this.element = document.querySelectorAll(element);
  };
  DOM.prototype.on = function on(event, callback) {
    Array.prototype.forEach.call(this.element, function (element) {
      element.addEventListener(event, callback);
    });
  }
  DOM.prototype.off = function off(event, callback) {
    Array.prototype.forEach.call(this.element, function (element) {
      element.removeEventListener(event, callback);
    });
  };
  DOM.prototype.get = function get() {
    return this.element;
  };
  DOM.prototype.forEach = function forEach() {
    return Array.protptype.forEach.apply(this.element, arguments);
  };
  DOM.prototype.map = function map() {
    return Array.protptype.map.apply(this.element, arguments);
  };
  DOM.prototype.filter = function filter() {
    return Array.protptype.filter.apply(this.element, arguments);
  };
  DOM.prototype.reduce = function reduce() {
    return Array.protptype.reduce.apply(this.element, arguments);
  };
  DOM.prototype.reduceRight = function reduceRight() {
    return Array.protptype.reduceRight.apply(this.element, arguments);
  };
  DOM.prototype.every = function every() {
    return Array.protptype.every.apply(this.element, arguments);
  };
  DOM.prototype.some = function some() {
    return Array.protptype.some.apply(this.element, arguments);
  };
  //Métodos estáticos
  DOM.isArray = function isArray(elem) {
    return Object.prototype.toString.call(elem) === '[object Array]';
  };
  DOM.isObject = function isObject(elem) {
    return Object.prototype.toString.call(elem) === '[object Object]';
  };
  DOM.isFunction = function isFunction(elem) {
    return Object.prototype.toString.call(elem) === '[object Function]';
  };
  DOM.isNumber = function isNumber(elem) {
    return Object.prototype.toString.call(elem) === '[object Number]';
  };
  DOM.isString = function isString(elem) {
    return Object.prototype.toString.call(elem) === '[object String]';
  };
  DOM.isBoolean = function isBoolean(elem) {
    return Object.prototype.toString.call(elem) === '[object Boolean]';
  };
  DOM.isNull = function isNull(elem) {
    return Object.prototype.toString.call(elem) === '[object Null]'
      || Object.prototype.toString.call(elem) === '[object Undefined]';
  };

  /*
  No HTML:
  - Crie um formulário com um input de texto que receberá um CEP e um botão
  de submit;
  - Crie uma estrutura HTML para receber informações de endereço:
  "Logradouro, Bairro, Estado, Cidade e CEP." Essas informações serão
  preenchidas com os dados da requisição feita no JS.
  - Crie uma área que receberá mensagens com o status da requisição:
  "Carregando, sucesso ou erro."

  No JS:
  - O CEP pode ser entrado pelo usuário com qualquer tipo de caractere, mas
  deve ser limpo e enviado somente os números para a requisição abaixo;
  - Ao submeter esse formulário, deve ser feito um request Ajax para a URL:
  "https://viacep.com.br/ws/[CEP]/json/", onde [CEP] será o CEP passado
  no input criado no HTML;
  - Essa requisição trará dados de um CEP em JSON. Preencha campos na tela
  com os dados recebidos.
  - Enquanto os dados são buscados, na área de mensagens de status, deve mostrar
  a mensagem: "Buscando informações para o CEP [CEP]..."
  - Se não houver dados para o CEP entrado, mostrar a mensagem:
  "Não encontramos o endereço para o CEP [CEP]."
  - Se houver endereço para o CEP digitado, mostre a mensagem:
  "Endereço referente ao CEP [CEP]:"
  - Utilize a lib DOM criada anteriormente para facilitar a manipulação e
  adicionar as informações em tela.
  */

  const $formCEP = new DOM('.form');
  const $inputCEP = new DOM('.input');
  const $status = new DOM('[data-js="status-message"]')

  const $logradouro = new DOM('[data-js="logradouro"]');
  const $bairro = new DOM('[data-js="bairro"]');
  const $localidade = new DOM('[data-js="localidade"]');
  const $uf = new DOM('[data-js="uf"]');

  const xhr = new XMLHttpRequest();

  $formCEP.on('submit', handleSubmit);

  function handleSubmit(e) {
    e.preventDefault();

    const urlCEP = getUrl();

    xhr.open('GET', urlCEP);
    xhr.send();
    getMessage('loading');
    xhr.addEventListener('readystatechange', handleReadyStateChange);
  }

  function getUrl() {
    return `https://viacep.com.br/ws/${clearCEP()}/json/`;
  };

  function clearCEP() {
    return $inputCEP.get()[0].value.replace(/\D/g, '');
  }

  function handleReadyStateChange() {
    if (isRequestOK()) {
      getMessage('ok');
      fillFields();
    }
  }

  function isRequestOK() {
    return xhr.readyState === 4 && xhr.status === 200;
  }

  function fillFields() {
    let data = parseData();
    console.log(data)
    if (data.erro) {
      getMessage('err');
      data = clearFields()
    }

    $logradouro.get()[0].textContent = data.logradouro;
    $bairro.get()[0].textContent = data.bairro;
    $localidade.get()[0].textContent = `${data.localidade} ${data.uf}`;
  }

  function clearFields() {
    return {
      logradouro: '',
      bairro: '',
      localidade: '',
      uf: ''
    }
  }

  function parseData() {
    let result;

    try {
      result = JSON.parse(xhr.responseText);
    } catch (e) {
      result = null;
    }
    return result;
  }

  function getMessage(type) {
    const messages = {
      loading: 'Buscando informações...',
      ok: 'Informações do CEP:',
      err: 'Verifique o CEP digitado.'
    };

    $status.get()[0].textContent = messages[type]
  }

})()
