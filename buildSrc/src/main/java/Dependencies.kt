object CoreDependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreVersions.kotlin}"

    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    const val jSoup = "org.jsoup:jsoup:${CoreVersions.jSoup}"
}

object UiDependencies {
    /**
     * AndroidX libs
     * */
    const val appCompat = "androidx.appcompat:appcompat:${UiVersions.appCompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${UiVersions.constraintLayout}"
    const val rv = "androidx.recyclerview:recyclerview:${UiVersions.rv}"
    const val design = "com.google.android.material:material:${UiVersions.design}"
    const val v4 = "androidx.legacy:legacy-support-v4:${UiVersions.v4}"
    const val cardView = "androidx.cardview:cardview:${UiVersions.cardView}"
    /**
     * AndroidX libs
     * */

    /**
     * External libs
     * */
    const val videoPlayer = "fm.jiecao:jiecaovideoplayer:${UiVersions.videoPlayer}"
    const val picasso = "com.squareup.picasso:picasso:${UiVersions.picasso}"
    const val rtlViewPager = "com.booking:rtlviewpager:${UiVersions.rtlViewPager}"
    /**
     * External libs
     * */
}

object TestDependencies {
    const val jUnit = "junit:junit:${TestVersions.jUnit}"
    const val runner = "androidx.test:runner:${TestVersions.runner}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${TestVersions.espressoCore}"
}