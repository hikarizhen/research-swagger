'use strict';


/**
 *
 * name String defaults to HelloWorld if not given (optional)
 * returns String
 **/
exports.getGreeting = function(name) {
  return new Promise(function(resolve, reject) {
    console.log(">>>DefaultService#Promise name=" + name);
    var rtn = {};
    var p_name = new String(name);

    if (p_name == 'undefined' || p_name == '') {
      rtn['application/json'] =  {
        "message" : "HelloWorld"
      };
    } else {
      rtn['application/json'] =  {
        "message" : "hello " + p_name
      };
    }

    resolve(rtn[Object.keys(rtn)[0]]);
  });
}

