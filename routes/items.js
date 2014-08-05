var items = [];
items.push({
	name: 'Some Item',
	description: 'I am some item?',
	path: 'http://nodejs.org/images/logos/nodejs-green.png'
});

items.push({
	name: 'I AM ME',
	description: 'He is you.',
	path: 'http://nodejs.org/images/ryan-speaker.jpg'
});

exports.list = function(req, res) {
	res.render('items' , {
		title: 'Items',
		items: items
	});
}