/*
 * Main App file App.js
 * @author David Ellinger
 */

 var http = require('http');
 var mongoose = require('mongoose');

 var db = mongoose.connect('mongodb://localhost/test');

 //Register schema
 var Schema = mongoose.Schema;
 var Items = new Schema({
 	name : String,
 	description : String
 });
 mongoose.model('Item', Items);



 var server = http.createServer(function(req, res){
 	var Item = mongoose.model('Item');
 	var item = new Item();
 	item.name = 'test';
 	item.description = 'I doubt this will work';
 	item.save(function(err){
 		if(err) throw err;
 		console.log("Item saved.");
 	})
 	res.end("YAY");

 });
 server.listen(3000);