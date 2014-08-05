/*
 * Main App file App.js
 * @author David Ellinger
 */


 var express = require('express');
 var app = express();
 //var mongoose = require('mongoose');

// var db = mongoose.connect('mongodb://localhost/test');

 //Register schema
/* var Schema = mongoose.Schema;
 var Items = new Schema({
 	name : String,
 	description : String
 });
 mongoose.model('Item', Items);*/

app.get('/', function(req, res){
	res.send('Hello');
});
app.listen(3000);