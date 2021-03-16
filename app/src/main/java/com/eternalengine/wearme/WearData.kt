package com.eternalengine.wearme

object WearData {

    private val wearNames = arrayOf(
        "Apple Watch Series 3",
        "Apple Watch Series 5",
        "Apple Watch SE",
        "Garmin Forerunner",
        "Garmin Venu",
        "Garmin VivoActive",
        "Samsung Galaxy Watch Active 2",
        "Samsung Galaxy Watch",
        "Samsung Galaxy Watch 3",
        "Xiaomi Mi Band 3",
        "Xiaomi Mi Band 4",
        "Xiaomi Mi Band 5",
    )
    private val wearFirstText = arrayOf(
        "WATCH",
        "WATCH",
        "WATCH",
        "FORE",
        "VENU",
        "VIVO",
        "WATCH",
        "GALAXY",
        "GALAXY",
        "MI",
        "MI",
        "MI",
    )
    private val wearLastText = arrayOf(
        "SERIES 3",
        "SERIES 5",
        "SE",
        "RUNNER",
        "",
        "ACTIVE",
        "ACTIVE 2",
        "WATCH",
        "WATCH 3",
        "BAND 3",
        "BAND 4",
        "BAND 5",
    )

    private val wearDetails = arrayOf(
        "Adding built-in cellular to the world’s number one watch. Whether users are out for a run, at the pool or just trying to be more active throughout their day, Apple Watch Series 3 with cellular allows them to stay connected, make calls, receive texts and more, even without iPhone nearby. The third-generation Apple Watch is an amazing health and fitness companion with intelligent coaching features, water resistance 50 meters1 and a new barometric altimeter that measures relative elevation. Apple Watch Series 3 comes in two models, one with GPS and cellular, and one with GPS, both featuring a 70 percent faster dual-core processor and new wireless chip.",
        "Redesigned and re-engineered to help users stay connected, be more active and manage their health in powerful new ways. While retaining the original iconic design, the fourth-generation Apple Watch has been refined, combining new hardware and software enhancements into a genuinely singular, unified form. The stunning display is over 30 percent larger and seamlessly integrates into the thinner, smaller case, while the new interface provides more information with richer detail. Apple Watch Series 4 with watchOS 5 brings advanced activity and communications features, along with revolutionary health capabilities, including a new accelerometer and gyroscope.",
        "Packing the essential features of Apple Watch into a modern design customers love — all at a more affordable price. The largest and most advanced Retina display allows customers to easily see more details and the information that matters most, right on their wrist. Apple Watch SE features the same accelerometer, gyroscope, and always-on altimeter as Apple Watch Series 6, and with the latest motion sensors and microphone, it offers robust health and safety capabilities including fall detection, Emergency SOS, international emergency calling, and the Noise app. ",
        "Whether you run to chase down new PRs, find your Zen or simply enjoy the outdoors, Garmin has a watch for you. That includes everything from easy-to-use GPS running watches to advanced smartwatches with extended battery life and music storage. Whatever reason you run for, run with Forerunner.",
        "Find out if you’re having a calm, balanced or stressful day. Relax reminders will even prompt you to do a short breathing activity when you’re feeling stressed. The Pulse Ox sensor1 gauges your blood oxygen saturation during the day and as you sleep to show how well your body is absorbing oxygen.",
        "You have goals to reach, and you need a watch that can keep up. Easily navigate the touchscreen display, and keep going all day with comfortable, interchangeable bands. The always-on, sunlight-readable Garmin Chroma Display™ technology is housed under durable Corning® Gorilla® Glass 3 that’s tough enough for you to go all in during your activities.",
        "Comfortably sleek the Galaxy Watch Active2 is light enough to wear anywhere comfortably; It comes in aluminum or stainless steel and with a variety of faces, bands and finishes so it goes with anything.",
        "Better insights to reach your fitness goals get more out of every mile thanks to built-in pace coaching on the Galaxy Watch Active2; Its advanced sensors keep your pace to help you better achieve your run goals. Audio Playing Format-MP3, M4A, 3GA, AAC, OGG, OGA,WAV, WMA, AMR, AWB",
        "Even when your phone isn’t in reach,⁵ make and take calls with an integrated speaker and voice mic, respond to texts, and access scores, headlines and playlists. Galaxy Watch automatically tracks select workouts,⁷ monitors heart rate and detects when you switch activities. Get credit for up to 39+ workouts, plus GPS capabilities when you go for a run.¹",
        "Wearable activity tracker produced by Xiaomi Inc. It was released on 31 May 2018. It has a capacitive OLED display. The tracker features heart rate monitoring, although it does not offer continuous heart rate display.",
        "Mi Smart Band 4 will track your heart rate, calories burned and more. as you climb mountain roads or dash around the city. Whether you're doing high-speed battle rope training or an aerobic battle rope workout, Mi Smart Band 4 will track your heart rate, calories burned and more.",
        "The Xiaomi Mi Band 5 is a wearable activity tracker produced by Xiaomi Inc. It was announced in China on 11 June 2020, and went on sale on 18 June 2020 in China, with a Global version released on 15 July 2020 as Xiaomi Mi Smart Band 5. It is slated for release in India on 29th September, 2020.",
    )

    private val wearImages = intArrayOf(
        R.drawable.apple_series3,
        R.drawable.apple_series5,
        R.drawable.apple_se,
        R.drawable.garmin_forerunner,
        R.drawable.garmin_venu,
        R.drawable.garmin_vivoactive,
        R.drawable.samsung_active2,
        R.drawable.samsung_watch1,
        R.drawable.samsung_watch3,
        R.drawable.xiaomi_band3,
        R.drawable.xiaomi_band4,
        R.drawable.xiaomi_band5,
    )

    val listData: ArrayList<Wear>
        get() {
            val list = arrayListOf<Wear>()
            for (position in wearNames.indices) {
                val wear = Wear()
                wear.name = wearNames[position]
                wear.firstSubtitle = wearFirstText[position]
                wear.lastSubtitle = wearLastText[position]
                wear.detail = wearDetails[position]
                wear.photo = wearImages[position]
                list.add(wear)
            }
            return list
        }
}