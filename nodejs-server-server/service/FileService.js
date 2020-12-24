'use strict';


/**
 * Find file by ID
 * Returns a file information
 *
 * fileId String ID of file to return
 * returns FWFile
 **/
exports.getFileById = function(fileId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "name" : "swagger intro",
  "id" : "20201217001",
  "status" : "available"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

