package com.example.wise4rmgod.custom_keyboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        close.setOnClickListener {

            val slidedown = AnimationUtils.loadAnimation(applicationContext,
                R.anim.abc_fade_out)
            keyboardparentlayout.startAnimation(slidedown)
            keyboardparentlayout.visibility= View.GONE
        }

        // method to disable android soft keyboard
        window.setFlags(
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)
        a1.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            a1.startAnimation(slideup)
            igboedittext.append("1")
           // a1.setBackgroundColor(resources.getColor( R.color.white))
            a1.textSize= 30F
        }
        b2.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            b2.startAnimation(slideup)
            igboedittext.append("2")
          //  b2.setBackgroundColor(resources.getColor( R.color.white))
            b2.textSize= 30F
        }
        c3.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            c3.startAnimation(slideup)
            igboedittext.append("3")
            //  b2.setBackgroundColor(resources.getColor( R.color.white))
            c3.textSize= 30F
        }
        d4.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            d4.startAnimation(slideup)
            igboedittext.append("4")
            //  b2.setBackgroundColor(resources.getColor( R.color.white))
            d4.textSize= 30F
        }

        e5.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            e5.startAnimation(slideup)
            igboedittext.append("5")
            e5.textSize= 30F}
        f6.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            f6.startAnimation(slideup)
            igboedittext.append("6")
            f6.textSize= 30F}
        g7.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            g7.startAnimation(slideup)
            igboedittext.append("7")
            g7.textSize= 30F}
        h8.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            h8.startAnimation(slideup)
            igboedittext.append("8")
            h8.textSize= 30F}
        k9.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            k9.startAnimation(slideup)
            igboedittext.append("9")
            k9.textSize= 30F}
        l0.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            l0.startAnimation(slideup)
            igboedittext.append("0")
            l0.textSize= 30F}
        a.setOnClickListener {
            // list.add("a")
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            a.startAnimation(slideup)
            a.textSize= 30F
            igboedittext.append("a")

        }


        b.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            b.startAnimation(slideup)
            b.textSize= 30F
            igboedittext.append("b")

        }
        c.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            c.startAnimation(slideup)
            c.textSize= 30F
            igboedittext.append("ch")
        }
        d.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            d.startAnimation(slideup)
            d.textSize= 30F
            igboedittext.append("d") }
        e.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            e.startAnimation(slideup)
            e.textSize= 30F
            igboedittext.append("e") }
        f.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            f.startAnimation(slideup)
            f.textSize= 30F
            igboedittext.append("f")}
        g.setOnClickListener { igboedittext.append("g") }
        h.setOnClickListener { igboedittext.append("h") }
        i.setOnClickListener { igboedittext.append("i") }
        j.setOnClickListener { igboedittext.append("j") }
        k.setOnClickListener { igboedittext.append("k") }
        l.setOnClickListener { igboedittext.append("l") }
        m.setOnClickListener { igboedittext.append("m") }
        n.setOnClickListener { igboedittext.append("n") }

        o.setOnClickListener { igboedittext.append("o") }
        p.setOnClickListener { igboedittext.append("p") }
        r.setOnClickListener { igboedittext.append("r") }
        s.setOnClickListener { igboedittext.append("s") }
        t.setOnClickListener { igboedittext.append("t") }
        u.setOnClickListener { igboedittext.append("u") }

        v.setOnClickListener { igboedittext.append("v")}
        w.setOnClickListener {igboedittext.append("w")}
        y.setOnClickListener { igboedittext.append("y")}
        z.setOnClickListener { igboedittext.append("z") }









        spacebar.setOnClickListener {
            igboedittext.append(" ")
        }

        back.setOnClickListener {
            igboedittext.text=null
        }


    }
}
