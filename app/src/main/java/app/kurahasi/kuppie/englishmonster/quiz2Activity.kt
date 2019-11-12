package app.kurahasi.kuppie.englishmonster

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class quiz2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        var Hp = intent.getIntExtra("hp", 50)

        button.setOnClickListener{
            button.setBackgroundColor(Color.parseColor("#FF9800"))
            button2.setBackgroundColor(Color.parseColor("#FFEB3B"))
            button3.setBackgroundColor(Color.parseColor("#FFEB3B"))
            button4.setBackgroundColor(Color.parseColor("#FFEB3B"))
            answertext.text = "ざんねん！ちがうよ！"
        }

        button2.setOnClickListener {
            button2.setBackgroundColor(Color.parseColor("#FF9800"))
            button.setBackgroundColor(Color.parseColor("#FFEB3B"))
            button3.setBackgroundColor(Color.parseColor("#FFEB3B"))
            button4.setBackgroundColor(Color.parseColor("#FFEB3B"))
            answertext.text = "ざんねん！ちがうよ！"

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
            answertext.text = "やったね！正解！"

            Hp = Hp - 50
            hp.text = Hp.toString()
            hp.setTextColor(Color.rgb(255, 0, 0))

            Handler().postDelayed(Runnable {
                monsterimage.visibility = View.INVISIBLE
            }, 500)

            Handler().postDelayed(Runnable {
                Toast.makeText(this, "やった！敵を倒したよ！！", Toast.LENGTH_LONG).show()
            }, 1000)
        }

    }
}
