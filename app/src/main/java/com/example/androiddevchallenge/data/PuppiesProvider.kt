package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

object PuppiesProvider {

    val Aeolus = Puppy(
        id = 1,
        name = "Aeolus",
        age = 10,
        temperament = "Friendly, Clever, Courageous",
        height = 23,
        weight = 60,
        desc = "His size, strength, and unflagging spirit have earned the Airedale Terrier the nickname" +
                " “The King of Terriers.” The Airedale stands among the world’s most versatile dog breeds and " +
                "has distinguished himself as hunter, athlete, and companion.",
        image = R.drawable.aeolus
    )

    val Amaris = Puppy(
        id = 2,
        name = "Amaris",
        age = 11,
        temperament = "Independent, Easy-Going, Sweet-Tempered",
        height = 25,
        weight = 65,
        desc = "American Foxhounds are good-natured, low-maintenance hounds who get on well with kids, dogs," +
                " even cats, but come with special considerations for prospective owners. They are closely associated" +
                " with Revolutionary heroes and the estates of old Virginia.",
        image = R.drawable.amaris
    )

    val Cecile = Puppy(
        id = 3,
        name = "Cecile",
        age = 10,
        temperament = "Loyal, Independent, Deeply Affectionate",
        height = 25,
        weight = 50,
        desc = "Tall and elegant, the Azawakh is a West African sighthound who originates from the countries" +
                " of Burkina Faso, Mali, and Niger. The Azawakh has a short, fine coat which may come in any color" +
                " or color combinations: red, clear sand to fawn, brindled, parti-color (which may be predominantly" +
                " white), blue, black and brown. The head may have a black mask and there may be white markings on the" +
                " legs, bib and at the tip of tail. There are no color or marking disqualifications in the breed. Befitting" +
                " its heritage, the Azawakh excels as a companion, guardian and a lure courser in the United States.",
        image = R.drawable.cecile
    )

    val Deirdre = Puppy(
        id = 4,
        name = "Deirdre",
        age = 12,
        temperament = "Friendly, Bright, Sweet-Natured",
        height = 19,
        weight = 45,
        desc = "An archetypic water dog of France, the Barbet is a rustic breed of medium size and balanced proportions" +
                " who appears in artwork as early as the 16th century. In profile, the Barbet is slightly rectangular with" +
                " a substantial head and long, sweeping tail. He has a long, dense covering of curly hair and a distinctive" +
                " beard. An agile athlete, the Barbet has been used primarily to locate, flush, and retrieve birds. He has" +
                " a cheerful disposition and is very social and loyal.",
        image = R.drawable.deirdre
    )

    val Fiona = Puppy(
        id = 5,
        name = "Fiona",
        age = 14,
        temperament = "Friendly, Curious, Merry",
        height = 13,
        weight = 20,
        desc = "Not only is the Beagle an excellent hunting dog and loyal companion, it is also happy-go-lucky, funny, " +
                "and—thanks to its pleading expression—cute. They were bred to hunt in packs, so they enjoy company and " +
                "are generally easygoing.",
        image = R.drawable.fiona
    )

    val Gina = Puppy(
        id = 6,
        name = "Gina",
        age = 11,
        temperament = "Bright, Fun-Loving, Active",
        height = 23,
        weight = 65,
        desc = "Loyalty, affection, intelligence, work ethic, and good looks: Boxers are the whole doggy package. Bright" +
                " and alert, sometimes silly, but always courageous, the Boxer has been among America’s most popular dog" +
                " breeds for a very long time.",
        image = R.drawable.gina
    )

    val Kiki = Puppy(
        id = 7,
        name = "Kiki",
        age = 12,
        temperament = "Loyal, Courageous, Athletic",
        height = 24,
        weight = 88,
        desc = "The Dogo Argentino is a pack-hunting dog, bred for the pursuit of big-game such as wild boar and puma, " +
                "and possesses the strength, intelligence and quick responsiveness of a serious athlete. His short, plain" +
                " and smooth coat is completely white, but a dark patch near the eye is permitted as long as it doesn't cover" +
                " more than 10% of the head.",
        image = R.drawable.kiki
    )

    val Miko = Puppy(
        id = 8,
        name = "Miko",
        age = 13,
        temperament = "Friendly, Clever, Courageous",
        height = 11,
        weight = 18,
        desc = "The unique-looking Dandie Dinmont Terrier is a tough but dignified little exterminator. Sturdily built" +
                " for the rigors of farm life, they will agreeably adapt to city living. Dandies are compact companions " +
                "blessed with a big personality.",
        image = R.drawable.miko
    )

    val Milo = Puppy(
        id = 9,
        name = "Milo",
        age = 14,
        temperament = "Friendly, Good-Natured, Lively",
        height = 20,
        weight = 30,
        desc = "The lively Finnish Spitz, the flame-colored, foxy-faced breed from the “Land of 60,000 Lakes,” is a small" +
                " but fearless hunting dog whose unique style of tracking and indicating quarry has earned him the nickname" +
                " the “Barking Bird Dog.”",
        image = R.drawable.milo
    )

    val Sera = Puppy(
        id = 10,
        name = "Sera",
        age = 13,
        temperament = "Devoted, Lively, Attentive",
        height = 15,
        weight = 25,
        desc = "The German Spitz is always attentive, lively and exceptionally devoted to his owner. He is very teachable" +
                " and easy to train. His distrust towards strangers and lack of hunting instinct make him the ideal watchdog " +
                "for the home. His indifference to weather, robustness and longevity are his most outstanding attributes.",
        image = R.drawable.sera
    )

    val puppyList = listOf(
        Aeolus, Amaris, Cecile, Deirdre, Fiona, Gina, Kiki, Miko, Milo, Sera
    )
}