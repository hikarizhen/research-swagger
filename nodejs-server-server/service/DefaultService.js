'use strict';


/**
 *
 * name String defaults to HelloWorld if not given (optional)
 * returns String
 **/
exports.getGreeting = function(name) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

