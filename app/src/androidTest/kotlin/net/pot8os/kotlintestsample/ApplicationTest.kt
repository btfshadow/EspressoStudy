package net.pot8os.kotlintestsample

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author So Nakamura, 2015/12/19
 */
@RunWith(AndroidJUnit4::class)
class ApplicationTest {

    @Rule @JvmField
    val activity = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun testAdd() {
        var valor1 = 123
        var valor2 = 321
        var resultado = "20,000"
        CalcRobots().ButtonRobots(valor1.toString()+"+"+valor2.toString()+"=").validRobots("${valor1 + valor2}")
    }

    @Test
    fun testSub() {
        var valor1 = 999
        var valor2 = 333
        var resultado = "20,000"
        CalcRobots().ButtonRobots(valor1.toString()+"-"+valor2.toString()+"=").validRobots("${valor1 - valor2}")
    }

    @Test
    fun testMulti() {
        var valor1 = 100
        var valor2 = 200
        var resultado = "20,000"
//        onView(withId(R.id.button_1)).perform(click())
//        onView(withId(R.id.button_0)).perform(click())
//        onView(withId(R.id.button_0)).perform(click())
//        onView(withId(R.id.button_multi)).perform(click())
//        onView(withId(R.id.button_2)).perform(click())
//        onView(withId(R.id.button_0)).perform(click())
//        onView(withId(R.id.button_0)).perform(click())
//        onView(withId(R.id.button_calc)).perform(click())
//        onView(withId(R.id.field)).check(matches(withText("${"20,000"}")))
        CalcRobots().ButtonRobots(valor1.toString()+"/"+valor2.toString()+"=").validRobots(resultado)
    }

    @Test
    fun testDiv() {
        var valor1 = 333
        var valor2 = 100
        var resultado = "3.33"

        CalcRobots().ButtonRobots(valor1.toString()+"/"+valor2.toString()+"=").validRobots("${valor1 / valor2.toFloat()}")

    }
}