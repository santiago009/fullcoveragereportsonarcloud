package com.f.fullcoveragereportsonarcloud

import org.junit.Assert
import org.junit.Test

class MainActivityTest {


    @Test
    fun prueba(){

        var a =3
        var viewmodelExampleTest = ViewmodelExample()

        Assert.assertEquals(viewmodelExampleTest.suma(1,2),a)
    }
}