package com.example.dota2heroes

object HeroesData {
    private val heroNames = arrayOf(
        "Sven",
        "Earthshaker",
        "Juggernaut",
        "Mirana",
        "Slark",
        "Windranger",
        "Templar Assassin",
        "Monkey King",
        "Dragon Knight",
        "Lion"
    )

    private val heroRoles = arrayOf(
        "Melee - Carry - Disabler \nInitiator - Durable - Nuker",
        "Melee - Support - Initiator \nDisabler - Nuker",
        "Melee - Carry - Pusher - Escape",
        "Ranged - Carry - Support \nEscape - Nuker - Disabler",
        "Melee - Carry - Escape \nDisabler - Nuker",
        "Ranged - Carry - Support \nDisabler - Escape - Nuker",
        "Ranged - Carry - Escape",
        "Melee - Carry - Escape \nDisabler - Initiator",
        "Melee - Carry - Pusher \nDurable - Disabler - Initiator",
        "Ranged - Support - Disabler \nNuker - Initiator"
    )

    private val heroBios = arrayOf(
        "Sven is the bastard son of a Vigil Knight, born of a Pallid Meranth, raised in the Shadeshore Ruins. With his father executed for violating the Vigil Codex, and his mother shunned by her wild race, Sven believes that honor is to be found in no social order, but only in himself. After tending his mother through a lingering death, he offered himself as a novice to the Vigil Knights, never revealing his identity. For thirteen years he studied in his father's school, mastering the rigid code that declared his existence an abomination. Then, on the day that should have been his In-Swearing, he seized the Outcast Blade, shattered the Sacred Helm, and burned the Codex in the Vigil's Holy Flame. He strode from Vigil Keep, forever solitary, following his private code to the last strict rune. Still a knight, yes...but a Rogue Knight. He answers only to himself.",
        "Like a golem or gargoyle, Earthshaker was one with the earth but now walks freely upon it. Unlike those other entities, he created himself through an act of will, and serves no other master. In restless slumbers, encased in a deep seam of stone, he became aware of the life drifting freely above him. He grew curious. During a season of tremors, the peaks of Nishai shook themselves loose of avalanches, shifting the course of rivers and turning shallow valleys into bottomless chasms. When the land finally ceased quaking, Earthshaker stepped from the settling dust, tossing aside massive boulders as if throwing off a light blanket. He had shaped himself in the image of a mortal beast, and named himself Raigor Stonehoof. He bleeds now, and breathes, and therefore he can die. But his spirit is still that of the earth; he carries its power in the magical totem that never leaves him. And on the day he returns to dust, the earth will greet him as a prodigal son.",
        "No one has ever seen the face hidden beneath the mask of Yurnero the Juggernaut. It is only speculation that he even has one. For defying a corrupt lord, Yurnero was exiled from the ancient Isle of Masks--a punishment that saved his life. The isle soon after vanished beneath the waves in a night of vengeful magic. He alone remains to carry on the Isle's long Juggernaut tradition, one of ritual and swordplay. The last practitioner of the art, Yurnero's confidence and courage are the result of endless practice; his inventive bladework proves that he has never stopped challenging himself. Still, his motives are as unreadable as his expression. For a hero who has lost everything twice over, he fights as if victory is a foregone conclusion.",
        "Born to a royal family, a blood princess next in line for the Solar Throne, Mirana willingly surrendered any claim to mundane land or titles when she dedicated herself completely to the service of Selemene, Goddess of the Moon. Known ever since as Princess of the Moon, Mirana prowls the sacred Nightsilver Woods searching for any who would dare poach the sacred luminous lotus from the silvery pools of the Goddess's preserve. Riding on her enormous feline familiar, she is poised, proud and fearless, attuned to the phases of the moon and the wheeling of the greater constellations. Her bow, tipped with sharp shards of lunar ore, draws on the moon's power to charge its arrows of light.",
        "Little known to the inhabitants of the dry world, Dark Reef is a sunken prison where the worst of the sea-bred are sent for crimes against their fellows. It is a razor barbed warren full of murderous slithereen, treacherous Deep Ones, sociopathic meranths. In this dim labyrinth, patrolled by eels and guarded by enormous anemones, only the vicious survive. Pitched into Dark Reef for crimes unknown, Slark spent half a lifetime without kin or kindness, trusting no one, surviving through a combination of stealth and ruthlessness, keeping his thoughts and his plans to himself. When the infamous Dark Reef Dozen plotted their ill-fated breakout, they kept their plans a perfect secret, murdering anyone who could have put the pieces together--but somehow Slark discovered their scheme and made a place for himself in it. Ten of the Dozen died in the escape attempt, and two were captured, hauled back to Dark Reef, then executed for the entertainment of their fellow inmates. But Slark, the unsung thirteenth, used the commotion as cover and slipped away, never to be caught. Now a furtive resident of the carnivorous mangrove scrub that grips the southern reach of Shadeshore, Slark remains the only successful escapee from Dark Reef.",
        "The western forests guard their secrets well. One of these is Lyralei, master archer of the wood, and favored godchild of the wind. Known now as Windranger, Lyralei's family was killed in a storm on the night of her birth--their house blown down by the gale, contents scattered to the winds. Only the newborn survived among the debris field of death and destruction. In the quiet after the storm, the wind itself took notice of the lucky infant crying in the grass. The wind pitied the child and so lifted her into the sky and deposited her on a doorstep in a neighboring village. In the years that followed, the wind returned occasionally to the child's life, watching from a distance while she honed her skills. Now, after many years of training, Windranger fires her arrows true to their targets. She moves with blinding speed, as if hastened by a wind ever at her back. With a flurry of arrows, she slaughters her enemies, having become, nearly, a force of nature herself.",
        "Lanaya, the Templar Assassin, came to her calling by a path of curious inquiry. Possessed of a scientific bent, she spent her early years engaged in meticulous study of nature's laws--peering into grimoires of magic and alchemy, recreating experiments from charred fragments of the Violet Archives, and memorizing observations of the Keen recordkeepers. Already quiet and secretive by nature, the difficulty of acquiring these objects further reinforced her skills of stealth. Had she been less retiring, she might have become notorious among the guilds as a thief-scholar. Instead her investigations led her into far more obscure corners. As she devoted her furtive talents to unlocking the secrets of the universe, she instead unlocked a secret door that exists in nature itself: the entryway to the most Hidden Temple. The intelligences that waited beyond that portal, proved to be expecting her, and whatever mysteries they revealed in the moment of their discovery was nothing compared to the answers they held out to Lanaya should she continue in their service. She swore to protect the mysteries, but more to the point, in service to the Hidden Temple she satisfies her endless craving for understanding. In the eyes of each foe she expunges, a bit more of the mystery is revealed.",
        "For 500 years the mountain pressed down upon him, only his head free from the crushing weight of the stonewrought prison the elder gods had summoned to halt his childish rebellion. Moss grew along the lines of his exposed face, tufts of grass sprouted from his ears; his vision was framed in wildflowers reaching from the soil around his cheeks. Most thought him long dead, tormented by the gods for waging war against the heavens until naught but his legend survived. But, as the stories go, the Monkey King cannot die.",
        "After years on the trail of a legendary Eldwurm, the Knight Davion found himself facing a disappointing foe: the dreaded Slyrak had grown ancient and frail, its wings tattered, its few remaining scales stricken with scale-rot, its fangs ground to nubs, and its fire-gouts no more threatening than a pack of wet matchsticks. Seeing no honor to be gained in dragon-murder, Knight Davion prepared to turn away and leave his old foe to die in peace. But a voice crept into his thoughts, and Slyrak gave a whispered plea that Davion might honor him with death in combat. Davion agreed, and found himself rewarded beyond expectation for his act of mercy: As he sank his blade in Slyrak's breast, the dragon pierced Davion's throat with a talon. As their blood mingled, Slyrak sent his power out along the Blood Route, sending all its strength and centuries of wisdom to the knight. The dragon's death sealed their bond and Dragon Knight was born. The ancient power slumbers in the Dragon Knight Davion, waking when he calls it. Or perhaps it is the Dragon that calls the Knight...",
        "Once a Grandmaster of the Demon Witch tradition of sorcery, Lion earned fame among his brethren for fighting on the side of light and righteousness. But adulation corrupts. With powers surpassed only by his ambition, the mage was seduced by a demon and turned to evil, trading his soul for prestige. After committing horrible crimes that marred his soul, he was abandoned. The demon betrayed him, striking better deals with his enemies. Such was Lion's rage that he followed the demon back to hell and slew it, ripping it limb from limb, taking its demonic hand for his own. However, such demonoplasty comes at a cost. Lion was transfigured by the process, his body transformed into something unrecognizable. He rose from hell, rage incarnate, slaying even those who had once called him master, and laying waste to the lands where he had once been so adored. He survives now as the sole practitioner of the Demon Witch tradition, and those who present themselves as acolytes or students are soon relieved of their mana and carried off by the faintest gust of wind."
    )

    private val heroImages = intArrayOf(
        R.drawable.sven,
        R.drawable.earthshaker,
        R.drawable.juggernaut,
        R.drawable.mirana,
        R.drawable.slark,
        R.drawable.windranger,
        R.drawable.templar_assassin,
        R.drawable.monkey_king,
        R.drawable.dragon_knight,
        R.drawable.lion
    )

    private val heroDetailImages = intArrayOf(
        R.drawable.sven_full,
        R.drawable.earthshaker_full,
        R.drawable.juggernaut_full,
        R.drawable.mirana_full,
        R.drawable.slark_full,
        R.drawable.windranger_full,
        R.drawable.templar_assassin_full,
        R.drawable.monkey_king_full,
        R.drawable.dragon_knight_full,
        R.drawable.lion_full
    )

    private val heroSkillImages = arrayOf(
        intArrayOf(R.drawable.sven_skill1,R.drawable.sven_skill2,R.drawable.sven_skill3,R.drawable.sven_skill4),
        intArrayOf(R.drawable.earthshaker_skill1,R.drawable.earthshaker_skill2,R.drawable.earthshaker_skill3,R.drawable.earthshaker_skill4),
        intArrayOf(R.drawable.juggernaut_skill1,R.drawable.juggernaut_skill2,R.drawable.juggernaut_skill3,R.drawable.juggernaut_skill4),
        intArrayOf(R.drawable.mirana_skill1,R.drawable.mirana_skill2,R.drawable.mirana_skill3,R.drawable.mirana_skill4),
        intArrayOf(R.drawable.slark_skill1,R.drawable.slark_skill2,R.drawable.slark_skill3,R.drawable.slark_skill4),
        intArrayOf(R.drawable.windranger_skill1,R.drawable.windranger_skill2,R.drawable.windranger_skill3,R.drawable.windranger_skill4),
        intArrayOf(R.drawable.templar_assassin_skill1,R.drawable.templar_assassin_skill2,R.drawable.templar_assassin_skill3,R.drawable.templar_assassin_skill4),
        intArrayOf(R.drawable.monkey_king_skill1,R.drawable.monkey_king_skill2,R.drawable.monkey_king_skill3,R.drawable.monkey_king_skill4),
        intArrayOf(R.drawable.dragon_knight_skill1,R.drawable.dragon_knight_skill2,R.drawable.dragon_knight_skill3,R.drawable.dragon_knight_skill4),
        intArrayOf(R.drawable.lion_skill1,R.drawable.lion_skill2,R.drawable.lion_skill3,R.drawable.lion_skill4)
    )

    private val heroSkillName = arrayOf(
        arrayOf("Storm Hammer", "Great Cleave", "Warcry", "God's Strength"),
        arrayOf("Fissure", "Enchant Totem", "Aftershock", "Echo Slam"),
        arrayOf("Blade Fury", "Healing Ward", "Blade Dance", "Omnislash"),
        arrayOf("Starstorm", "Sacred Arrow", "Leap", "Moonlight Shadow"),
        arrayOf("Dark Pact", "Pounce", "Essence Shift", "Shadow Dance"),
        arrayOf("Shackleshot", "Powershot", "Windrun", "Focus Fire"),
        arrayOf("Refraction", "Meld", "Psi Blades", "Psionic Trap"),
        arrayOf("Boundless Strike", "Tree Dance", "Jingu Mastery", "Wukong's Command"),
        arrayOf("Breathe Fire", "Dragon Tail", "Dragon Blood", "Elder Dragon Form"),
        arrayOf("Earth Spike", "Hex", "Mana Drain", "Finger of Death")
    )

    private val heroSkillDescription = arrayOf(
        arrayOf("Sven unleashes his magical gauntlet that deals damage and stuns enemy units in a small area around the target.", "Sven strikes with great force, cleaving all nearby enemy units with his attack.", "Sven's Warcry heartens his allied heroes for battle, increasing their movement speed and provides them with an attack damage shield. Buff ends if the shield is consumed. Shield health grows based on Sven's strength.", "Sven channels his rogue strength, granting bonus strength and damage for %duration_tooltip% seconds."),
        arrayOf("Slams the ground with a mighty totem, creating an impassable ridge of stone while stunning and damaging enemy units along its line.", "Empowers Earthshaker's totem, causing it to deal extra damage on the next attack.", "Causes the earth to shake underfoot, adding additional damage and stuns to nearby enemy units when Earthshaker casts his abilities.", "Shockwaves travel through the ground, damaging enemy units. Each enemy hit causes an echo to damage nearby units. Real heroes cause two echoes."),
        arrayOf("Causes a bladestorm of destructive force around Juggernaut, rendering him immune to magic and dealing damage to nearby enemy units. DISPEL TYPE: Basic Dispel", "Summons a Healing Ward which heals all nearby allied units, based on their max health. The Healing Ward moves at 350 movement speed after being summoned. Lasts %healing_ward_duration_tooltip% seconds.", "Gives Juggernaut a chance to deal critical damage on each attack.", "Juggernaut leaps towards the target enemy units, and then slashes the target and other nearby enemy units at an increased attack rate. Juggernaut is invulnerable for the duration."),
        arrayOf("Calls down a wave of meteors to damage nearby enemy units. The closest enemy unit to Mirana in a 425 radius will be struck a second time for 75% of the damage.", "Fires a long-range arrow with deadly precision, which stuns and damages the first enemy unit it strikes. The stun duration ranges from 0.01 to 5 seconds, with bonus damage up to 180 added, based on the distance the arrow travels to its target. Instantly kills the first non-ancient creep it hits.", "Mirana leaps forward into battle, empowering herself with a ferocious roar that grants bonus attack and movement speed. Speed bonus lasts 2.5 seconds.", "Turns Mirana and all allied heroes invisible and grants bonus movment speed. If a hero is revealed, invisibility will restore after the fade delay as long as Moonlight Shadow's duration has not expired."),
        arrayOf("After a short delay, Slark sacrifices some of his life blood, purging most negative debuffs and dealing damage to enemy units around him and to himself. Slark only takes 50% of the damage. DISPEL TYPE: Strong Dispel", "Slark leaps forward, grabbing the first hero he connects with. That unit is leashed, and can only move a limited distance away from Slark's landing position.", "Slark steals the life essence of enemy heroes with his attacks, draining each of their attributes and converting them to bonus Agility. If Slark kills an affected enemy hero, he permanently steals 1 Agility.", "When used, Slark hides himself in a cloud of shadows, becoming immune to detection. Attacking, casting spells, and using items will not reveal Slark. Passively, when not visible to the enemy team, Slark gains bonus movement speed and health regeneration."),
        arrayOf("Shackles the target to an enemy unit or tree in a line directly behind it. If no unit or tree is present, the stun duration is reduced to 0.75.", "Windranger charges her bow for up to %channel_time_tooltip% second for a single powerful shot, which deals more damage the longer it is charged. The arrow damages enemies along its path. For each enemy that Powershot hits, its damage is reduced by %damage_reduction%%.", "Increases movement speed and adds evasion from all physical attacks, while slowing movement of nearby enemies.", "Windranger channels the wind to gain 450 additional attack speed against a single enemy unit or structure, though with a reduction to her attack damage. Extra damage from secondary item effects is not reduced. Lasts %focusfire_duration_tooltip% seconds."),
        arrayOf("Templar Assassin becomes highly elusive, avoiding damage and gaining a bonus to her damage. The damage and avoidance effects are separate, and have a limited number of instances.", "Templar Assassin conceals herself, becoming invisible as long as she remains still. If Meld's invisibility is broken by attacking an enemy, Lanaya will deal bonus damage to the enemy and reduce their armor for %armor_reduction_duration_tooltip% seconds.", "Templar Assassin's psi blades slice through the attacked unit, splitting and damaging enemy units directly behind it, while gaining bonus attack range.", "Templar Assassin places mystical traps that invisibly monitor enemy movement. When sprung at her command, they exert a slowing influence of 30% in the area. Traps charge up to slow 60% after 4 seconds. Deals bonus damage when fully charged."),
        arrayOf("Monkey King enlarges his staff and slams it against the ground, stunning enemies in a line and damaging them with a critical hit based on his attack. Has True Strike.", "Monkey King jumps to a tree and perches atop it. While perched, he gains the Primal Spring ability-a channeled leap attack. If Monkey King's tree is destroyed, he falls and is stunned for 4 seconds. Taking damage from player controlled units or Roshan while on the ground puts Tree Dance on cooldown.", "Monkey King's attacks awaken the Jingu Bang's power. Upon the fourth hit on the same enemy hero, Monkey King earns four charged attacks that have bonus damage and lifesteal.", "Monkey King creates a circular formation of soldiers that spread out from his position. If Monkey King leaves the area his soldiers disperse. The soldiers have Monkey King's attack and only target heroes. Monkey King is granted bonus armor for the spell's duration."),
        arrayOf("Unleashes a breath of fire in front of Dragon Knight that burns enemies and reduces the damage their attacks deal.", "Dragon Knight smites an enemy unit in melee range with his shield, stunning it while dealing minor damage. When in Elder Dragon Form, the cast range increases to 400.", "The life blood of the Dragon improves health regeneration and strengthens armor.", "Dragon Knight takes the form of one of three powerful elder dragons, increasing his speed, and Dragon Tail's range, while granting him new powers. "),
        arrayOf("Rock spikes burst from the earth along a straight path. Enemy units are hurled into the air, then are stunned and take damage when they fall.", "Transforms an enemy unit into a harmless beast, with all special abilities disabled.", "CHANNELED - Absorbs the magical energies of a target enemy unit by taking mana from it every second.", "Rips at an enemy unit, trying to turn it inside-out. Deals massive damage and grows stronger with each life it consumes.")
    )

    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.role = heroRoles[position]
                hero.bio = heroBios[position]
                hero.image = heroImages[position]
                hero.detail_image = heroDetailImages[position]
                hero.skill_image = heroSkillImages[position]
                hero.skill_name = heroSkillName[position]
                hero.skill_description = heroSkillDescription[position]
                list.add(hero)
            }
            return list
        }
}