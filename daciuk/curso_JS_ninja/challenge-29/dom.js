(function (win, doc) {

  function DOM(elements) {
    if (!(this instanceof DOM)) return new DOM(elements)
    this.element = doc.querySelectorAll(element);
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
  DOM.prototype.get = function get(index) {
    if (!index)
      return this.element[0];
    return this.element[index];
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

  win.DOM = DOM
})(window, document)