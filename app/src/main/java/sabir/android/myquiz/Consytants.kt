package sabir.android.myquiz

object Consytants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"
    fun GetQuestions() : ArrayList<Question>{
        val QuestionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Who Is This Famous Personality?",
            R.drawable.dhoni,
            "Mahendar singh dhoni","Virat Kohli","Arshdeep Singh","Jasprit Bumrah",1
        )
        QuestionsList.add(que1)

        val que2 = Question(
            2, "What is this sports called?",
            R.drawable.ice,
            "Polo","Cricket","Ice Hockey","Baseball",3
        )
        QuestionsList.add(que2)

        val que3 = Question(
            3, "Who Is This Character?",
            R.drawable.spider,
            "Spiderman","AADI","Batman","Superman",1
        )
        QuestionsList.add(que3)

        val que4 = Question(
            4, "Which Countr flag is this?",
            R.drawable.india,
            "India","Pakistan","Mexico","Belgium",1
        )
        QuestionsList.add(que4)

        val que5 = Question(
            5, "What is this animal called?",
            R.drawable.lion,
            "Monkey","Lion","Ape","Bear",2
        )
        QuestionsList.add(que5)

        val que6 = Question(
            6, "Who Is This Famous Personality?",
            R.drawable.gandhi,
            "Br Ambedkar","Bhagat Singh","Nathuram","Mahatma Gandhi",
            4
        )
        QuestionsList.add(que6)

        val que7 = Question(
            7, "Who is this cartoon character?",
            R.drawable.shin,
            "Shinchan","Bochan","Nani","Kazama",1
        )
        QuestionsList.add(que7)

        val que8 = Question(
            8, "What is this indian sweet?",
            R.drawable.ras,
            "Malpua","Jalebi","Maggi","rasmalai",4
        )
        QuestionsList.add(que8)

        val que9 = Question(
            9, "Whose house is this?",
            R.drawable.ant,
            "SRK","Ambani","salman khan","Amitabh",2
        )
        QuestionsList.add(que9)



        return QuestionsList
    }
}