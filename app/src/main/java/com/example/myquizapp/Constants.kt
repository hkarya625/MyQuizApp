package com.example.myquizapp

object Constants {

    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Australia", "Armenia", "Austria",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        questionList.add(que2)

        val que3 = Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Australia", "Armenia", "Fiji",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand", "Australia", "Armenia", "Austria",
            1
        )
        questionList.add(que4)

        val que5= Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina", "Australia", "Germany", "Austria",
            3
        )
        questionList.add(que5)

        val que6= Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia", "Armenia", "Austria",
            2
        )
        questionList.add(que6)
        val que7 = Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina", "Kuwait", "Armenia", "America",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "Belgium", "Russia", "Austria",
            2
        )
        questionList.add(que8)

        val que9 = Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina", "Denmark", "Armenia", "Austria",
            2
        )
        questionList.add(que9)

        return questionList
    }
}