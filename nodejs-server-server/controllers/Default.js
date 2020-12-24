'use strict';

var utils = require('../utils/writer.js');
var Default = require('../service/DefaultService');

module.exports.getGreeting = function getGreeting (req, res, next) {
  var name = req.swagger.params['name'].value;
  Default.getGreeting(name)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
