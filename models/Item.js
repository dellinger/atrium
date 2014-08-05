var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/atrium');

var schema = new mongoose.Schema({
	name: String,
	decription: String,
	path: String
});

module.exports = mongoose.model('Item', schema);