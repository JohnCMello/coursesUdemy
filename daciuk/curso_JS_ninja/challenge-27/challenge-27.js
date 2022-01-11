(function () {
  'use strict'
  /*
  Aproveitando a lib DOM que fizemos na semana anterior, crie agora para ela
  métodos semelhantes aos que existem no array, mas que sirvam para os
  elementos do DOM selecionados.
  Crie os seguintes métodos:
  - forEach, map, filter, reduce, reduceRight, every e some.
  
  Crie também métodos que verificam o tipo do objeto passado por parâmetro.
  Esses métodos não precisam depender de criar um novo elmento do DOM, podem
  ser métodos estáticos.
  
  Métodos estáticos não obrigam o uso do `new`, podendo ser usados diretamente
  no objeto, como nos exemplos abaixo:
  DOM.isArray([1, 2, 3]); // true
  DOM.isFunction(function() {}); // true
  DOM.isNumber('numero'); // false
  
  Crie os seguintes métodos para verificação de tipo:
  - isArray, isObject, isFunction, isNumber, isString, isBoolean, isNull.
  O método isNull deve retornar `true` se o valor for null ou undefined.
  */

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

  const dom = new DOM();
})()

