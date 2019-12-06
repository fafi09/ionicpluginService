var exec = require('cordova/exec');

var randomReaderApi = {}
randomReaderApi.hello = function (arg0, success, error) {
    exec(success, error, 'RandomReader', 'hello', [arg0]);
};

randomReaderApi.randomReaderByKey = function(arg0,arg1, success, error) {
    exec(success, error, 'RandomReader', 'randomReaderByKey', [arg0,arg1]);
};
module.exports = randomReaderApi;