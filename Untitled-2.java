// write a program to prove that the given number are quadratic root are?
const express = require('express')
const app =express()

const myLogger = function(req,res,next)
{
    console.log('LOGGED');
    next()
}

app.use(myLogger);

app.get('/',(req,res) => {
    res.send('Hello World');
})

app.listen(3000);