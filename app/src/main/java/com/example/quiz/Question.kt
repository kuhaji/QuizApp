package com.example.quiz

//@author Juha Välimäki 1901928
//data frame for class question
data class Question (
    val id: Int,
    val question: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)