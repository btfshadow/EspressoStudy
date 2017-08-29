package net.pot8os.kotlintestsample


import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers



/**
 * Created by thiagogoncalves on 28/08/17.
 */

class CalcRobots {

    fun ButtonRobots(value: String): CalcRobots {
        val teclas = value.split("".toRegex())
        for (teclado in teclas) {
            when (teclado) {
                "1" -> Espresso.onView(ViewMatchers.withId(R.id.button_1)).perform(ViewActions.click())
                "2" -> Espresso.onView(ViewMatchers.withId(R.id.button_2)).perform(ViewActions.click())
                "3" -> Espresso.onView(ViewMatchers.withId(R.id.button_3)).perform(ViewActions.click())
                "4" -> Espresso.onView(ViewMatchers.withId(R.id.button_4)).perform(ViewActions.click())
                "5" -> Espresso.onView(ViewMatchers.withId(R.id.button_5)).perform(ViewActions.click())
                "6" -> Espresso.onView(ViewMatchers.withId(R.id.button_6)).perform(ViewActions.click())
                "7" -> Espresso.onView(ViewMatchers.withId(R.id.button_7)).perform(ViewActions.click())
                "8" -> Espresso.onView(ViewMatchers.withId(R.id.button_8)).perform(ViewActions.click())
                "9" -> Espresso.onView(ViewMatchers.withId(R.id.button_9)).perform(ViewActions.click())
                "0" -> Espresso.onView(ViewMatchers.withId(R.id.button_0)).perform(ViewActions.click())
                "+" -> Espresso.onView(ViewMatchers.withId(R.id.button_add)).perform(ViewActions.click())
                "-" -> Espresso.onView(ViewMatchers.withId(R.id.button_sub)).perform(ViewActions.click())
                "/" -> Espresso.onView(ViewMatchers.withId(R.id.button_divide)).perform(ViewActions.click())
                "*" -> Espresso.onView(ViewMatchers.withId(R.id.button_multi)).perform(ViewActions.click())
                "=" -> Espresso.onView(ViewMatchers.withId(R.id.button_calc)).perform(ViewActions.click())
            }
        }
        return this
    }

    fun validRobots(resultado: String) : CalcRobots {
        Espresso.onView(ViewMatchers.withId(R.id.field)).check(ViewAssertions.matches(ViewMatchers.withText(resultado)))
        return this
    }
}
