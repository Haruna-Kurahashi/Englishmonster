package app.kurahasi.kuppie.englishmonster

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var Hp : Int = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hp.text = "100"

        val intent : Intent = Intent(this, quiz2Activity::class.java)

    button.setOnClickListener{
        button.setBackgroundColor(Color.parseColor("#FF9800"))
        button2.setBackgroundColor(Color.parseColor("#FFEB3B"))
        button3.setBackgroundColor(Color.parseColor("#FFEB3B"))
        button4.setBackgroundColor(Color.parseColor("#FFEB3B"))
        answertext.text = "ざんねん！ちがうよ！"
    }

    button2.setOnClickListener{
        button2.setBackgroundColor(Color.parseColor("#FF9800"))
        button.setBackgroundColor(Color.parseColor("#FFEB3B"))
        button3.setBackgroundColor(Color.parseColor("#FFEB3B"))
        button4.setBackgroundColor(Color.parseColor("#FFEB3B"))
        answertext.text = "やったね！正解！"
        Hp = Hp - 50
        hp.text = Hp.toString()
        hp.setTextColor(Color.rgb(255,0,0))

            Handler().postDelayed(Runnable {
            intent.putExtra("hp", Hp)
            startActivity(intent)
        }, 2000)


    }

    button3.setOnClickListener{
        button3.setBackgroundColor(Color.parseColor("#FF9800"))
        button.setBackgroundColor(Color.parseColor("#FFEB3B"))
        button2.setBackgroundColor(Color.parseColor("#FFEB3B"))
        button4.setBackgroundColor(Color.parseColor("#FFEB3B"))
        answertext.text = "ざんねん！ちがうよ！"
    }

    button4.setOnClickListener {
        button4.setBackgroundColor(Color.parseColor("#FF9800"))
        button.setBackgroundColor(Color.parseColor("#FFEB3B"))
        button2.setBackgroundColor(Color.parseColor("#FFEB3B"))
        button3.setBackgroundColor(Color.parseColor("#FFEB3B"))
        answertext.text = "ざんねん！ちがうよ！"
    }

    }
}

