package com.example.groupwork

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.text.method.LinkMovementMethod
import android.text.SpannableString
import android.text.style.URLSpan
import android.text.Spanned

class MainActivity7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val home3Button: Button = findViewById(R.id.home3)
        home3Button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val textView7: TextView = findViewById<TextView>(R.id.textView7)
        textView7.movementMethod = LinkMovementMethod.getInstance()


        val textView10: TextView = findViewById<TextView>(R.id.textView10)
        textView10.movementMethod = LinkMovementMethod.getInstance()


        val textView14: TextView = findViewById<TextView>(R.id.textView14)
        textView14.movementMethod = LinkMovementMethod.getInstance()

        val textView20: TextView = findViewById(R.id.textView20)
        val spannableString = SpannableString(textView20.text)
        val urlSpan = URLSpan("https://www.google.com/maps/place/15+Cradock+Ave,+Rosebank,+Johannesburg,+2196/@-26.14664,28.04194,17z/data=!3m1!4b1!4m6!3m5!1s0x1e950c8d333d92f5:0x24fc096fff214952!8m2!3d-26.14664!4d28.04194!16s%2Fg%2F11c266y4gv?entry=ttu&g_ep=EgoyMDI0MTAxMy4wIKXMDSoASAFQAw%3D%3D")
        spannableString.setSpan(urlSpan, 0, spannableString.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView20.text = spannableString
        textView20.movementMethod = LinkMovementMethod.getInstance()

        val textView21: TextView = findViewById(R.id.textView21)
        val spannableString21 = SpannableString(textView21.text)
        val urlSpan21 = URLSpan("https://www.google.com/maps/place/151+Greenway,+Greenside,+Randburg,+2034/@-26.1462478,28.0109124,17z/data=!3m1!4b1!4m5!3m4!1s0x1e950b64226dee39:0x134c9d30b17bcb74!8m2!3d-26.1462478!4d28.0109124?entry=ttu&g_ep=EgoyMDI0MTAxMy4wIKXMDSoASAFQAw%3D%3D")
        spannableString21.setSpan(urlSpan21, 0, spannableString21.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView21.text = spannableString21
        textView21.movementMethod = LinkMovementMethod.getInstance()


        val textView22: TextView = findViewById(R.id.textView22)
        val spannableString22 = SpannableString(textView22.text)
        val urlSpan22 = URLSpan("https://www.google.com/maps/place/72+Beyers+Naud%C3%A9+Dr,+Westdene,+Johannesburg,+2092/@-26.1739877,28.0006294,17z/data=!3m1!4b1!4m5!3m4!1s0x1e950b99f2300f17:0xd2b21dd7cc87f8da!8m2!3d-26.1739877!4d28.0006294?entry=ttu&g_ep=EgoyMDI0MTAxMy4wIKXMDSoASAFQAw%3D%3D")
        spannableString22.setSpan(urlSpan22, 0, spannableString22.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView22.text = spannableString22
        textView22.movementMethod = LinkMovementMethod.getInstance()

    }
}
