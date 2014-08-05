/*
 * Main App file App.js
 * @author David Ellinger
 */

 var http = require('http');

 var server = http.createServer(function(req, res){
 	res.end("YAY");
 });
 server.listen(3000);