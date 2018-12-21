express = require('express');
Handlebars = require('handlebars');

const app = express();
const host = 'localhost';
const port = 3000;

var template = Handlebars.compile("Hello {{world}}!");

app.get('/', (req, res) => {
    res.send('use ' + host + ':' + port + '/test');
})

app.route('/test')
 .get((req, res) => {
    res.send('test');
});

app.route('/api/generate').get((req, res) => {
    res.send(template({ "world": "Handlebars.js"}));
});

app.listen(port, () => {
    console.log('App is running on port ', port);
})