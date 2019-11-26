package com.example.dota2heroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val tvHeroName: TextView = findViewById(R.id.hero_name)
        val tvHeroRole: TextView = findViewById(R.id.hero_role)
        val tvHeroBio: TextView = findViewById(R.id.hero_bio)
        val heroImage: ImageView = findViewById(R.id.hero_image_detail)

        val ivHeroSkill1: ImageView = findViewById(R.id.img_skill1)
        val ivHeroSkill2: ImageView = findViewById(R.id.img_skill2)
        val ivHeroSkill3: ImageView = findViewById(R.id.img_skill3)
        val ivHeroSkill4: ImageView = findViewById(R.id.img_skill4)

        val tvHeroSkillName1: TextView = findViewById(R.id.tv_skill1_name)
        val tvHeroSkillName2: TextView = findViewById(R.id.tv_skill2_name)
        val tvHeroSkillName3: TextView = findViewById(R.id.tv_skill3_name)
        val tvHeroSkillName4: TextView = findViewById(R.id.tv_skill4_name)

        val tvHeroSkillDetail1: TextView = findViewById(R.id.tv_skill1_detail)
        val tvHeroSkillDetail2: TextView = findViewById(R.id.tv_skill2_detail)
        val tvHeroSkillDetail3: TextView = findViewById(R.id.tv_skill3_detail)
        val tvHeroSkillDetail4: TextView = findViewById(R.id.tv_skill4_detail)

        val image = intent.getIntExtra(EXTRA_IMAGE, R.drawable.sven_full)
        val name = intent.getStringExtra(EXTRA_NAME)
        val role = intent.getStringExtra(EXTRA_ROLE)
        val bio = intent.getStringExtra(EXTRA_BIO)
        val img_skill1 = intent.getIntExtra(EXTRA_SKILL1_IMAGE, R.drawable.sven_skill1)
        val img_skill2 = intent.getIntExtra(EXTRA_SKILL2_IMAGE, R.drawable.sven_skill2)
        val img_skill3 = intent.getIntExtra(EXTRA_SKILL3_IMAGE, R.drawable.sven_skill3)
        val img_skill4 = intent.getIntExtra(EXTRA_SKILL4_IMAGE, R.drawable.sven_skill4)
        val name_skill1 = intent.getStringExtra(EXTRA_SKILL1_NAME)
        val name_skill2 = intent.getStringExtra(EXTRA_SKILL2_NAME)
        val name_skill3 = intent.getStringExtra(EXTRA_SKILL3_NAME)
        val name_skill4 = intent.getStringExtra(EXTRA_SKILL4_NAME)
        val desc_skill1 = intent.getStringExtra(EXTRA_SKILL1_DESCRIPTION)
        val desc_skill2 = intent.getStringExtra(EXTRA_SKILL2_DESCRIPTION)
        val desc_skill3 = intent.getStringExtra(EXTRA_SKILL3_DESCRIPTION)
        val desc_skill4 = intent.getStringExtra(EXTRA_SKILL4_DESCRIPTION)


        tvHeroName.text = name
        tvHeroRole.text = role
        tvHeroBio.text = bio
        heroImage.setImageResource(image)

        ivHeroSkill1.setImageResource(img_skill1)
        ivHeroSkill2.setImageResource(img_skill2)
        ivHeroSkill3.setImageResource(img_skill3)
        ivHeroSkill4.setImageResource(img_skill4)

        tvHeroSkillName1.text = name_skill1
        tvHeroSkillName2.text = name_skill2
        tvHeroSkillName3.text = name_skill3
        tvHeroSkillName4.text = name_skill4

        tvHeroSkillDetail1.text = desc_skill1
        tvHeroSkillDetail2.text = desc_skill2
        tvHeroSkillDetail3.text = desc_skill3
        tvHeroSkillDetail4.text = desc_skill4
    }

    companion object {
        const val EXTRA_POSITION = "extra_position"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ROLE = "extra_role"
        const val EXTRA_BIO = "extra_bio"
        const val EXTRA_SKILL1_IMAGE = "extra_skill1_image"
        const val EXTRA_SKILL2_IMAGE = "extra_skill2_image"
        const val EXTRA_SKILL3_IMAGE = "extra_skill3_image"
        const val EXTRA_SKILL4_IMAGE = "extra_skill4_image"
        const val EXTRA_SKILL1_NAME = "extra_skill1_name"
        const val EXTRA_SKILL2_NAME = "extra_skill2_name"
        const val EXTRA_SKILL3_NAME = "extra_skill3_name"
        const val EXTRA_SKILL4_NAME = "extra_skill4_name"
        const val EXTRA_SKILL1_DESCRIPTION = "extra_skill1_description"
        const val EXTRA_SKILL2_DESCRIPTION = "extra_skill2_description"
        const val EXTRA_SKILL3_DESCRIPTION = "extra_skill3_description"
        const val EXTRA_SKILL4_DESCRIPTION = "extra_skill4_description"

    }
}
