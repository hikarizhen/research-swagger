'use strict';

var utils = require('../utils/writer.js');
var File = require('../service/FileService');

module.exports.getFileById = function getFileById (req, res, next) {
  var fileId = req.swagger.params['fileId'].value;
  File.getFileById(fileId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
