package com.example.dota2heroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Hero> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(HeroesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvHeroes.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListHeroAdapter.OnItemClickCallback {
            override fun onItemClicked(position: Int, data: Hero) {
                showSelectedHero(position, data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setOption(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setOption(selectedOption: Int) {
        when (selectedOption) {
            R.id.about -> {
                val moveIntentAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntentAbout)
            }
        }
    }

    private fun showSelectedHero(position: Int, hero: Hero) {
        val name = hero.name
        val role = hero.role
        val bio = hero.bio
        val img_skill1 = hero.skill_image[0]
        val img_skill2 = hero.skill_image[1]
        val img_skill3 = hero.skill_image[2]
        val img_skill4 = hero.skill_image[3]
        val name_skill1 = hero.skill_name[0]
        val name_skill2 = hero.skill_name[1]
        val name_skill3 = hero.skill_name[2]
        val name_skill4 = hero.skill_name[3]
        val description_skill1 = hero.skill_description[0]
        val description_skill2 = hero.skill_description[1]
        val description_skill3 = hero.skill_description[2]
        val description_skill4 = hero.skill_description[3]
        val image = hero.detail_image

        val moveIntentDetailActivity = Intent(this@MainActivity, DetailActivity::class.java)

        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_POSITION, position)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_IMAGE, image)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_NAME, name)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_ROLE, role)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_BIO, bio)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL1_IMAGE, img_skill1)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL2_IMAGE, img_skill2)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL3_IMAGE, img_skill3)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL4_IMAGE, img_skill4)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL1_NAME, name_skill1)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL2_NAME, name_skill2)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL3_NAME, name_skill3)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL4_NAME, name_skill4)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL1_DESCRIPTION, description_skill1)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL2_DESCRIPTION, description_skill2)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL3_DESCRIPTION, description_skill3)
        moveIntentDetailActivity.putExtra(DetailActivity.EXTRA_SKILL4_DESCRIPTION, description_skill4)

        startActivity(moveIntentDetailActivity)
    }
}
