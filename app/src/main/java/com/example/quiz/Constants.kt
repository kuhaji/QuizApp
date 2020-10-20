package com.example.quiz


//@author Juha Välimäki 1901928
//first i made this application from this object but after this i made application fetch data from json
object Constants {

    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "How do you say this in finnish: What?",
            "Mitä", "Kuka",
            "Missä", "Milloin", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "How do you say this in finnish: Do you?",
            "Minä", "Se",
            "Sinä", "Hän", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "How do you say this in finnish: Like?",

            "Vihata", "Epäillä",
            "Inhota", "Tykätä", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "How do you say this in finnish: My?",
            "Sinun", "Minun",
            "Teidän", "Heidän", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "How do you say this in finnish: Application?",
            "Tietokone", "Puhelin",
            "Sovellus", "Internet", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "How do you say this in finnish: I hope?",
            "Toivon", "Epäilen",
            "Ihailen", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "How do you say this in finnish: This?",
            "Se", "Tuo",
            "Tämä", "Ne", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "How do you say this in finnish: Assignment?",
            "Kurssi", "Projekti",
            "Työ", "Tehtävä", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "How do you say this in finnish: Will?",
            "Vihata", "Haluta",
            "Inhota", "Kävellä", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "How do you say this in finnish: Pass?",
            "Läpi", "Hylätty",
            "Ihan ok", "Tosi hyvä", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}