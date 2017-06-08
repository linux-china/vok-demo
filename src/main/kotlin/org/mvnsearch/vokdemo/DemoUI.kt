package org.mvnsearch.vokdemo

import com.vaadin.annotations.Theme
import com.vaadin.annotations.Title
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout

/**
 * demo UI

 * @author linux_china
 */
@SpringUI(path = "/demo")
@Title("Vaadin Demo")
@Theme("valo")
class DemoUI : UI() {
    private val layout: VerticalLayout = VerticalLayout()

    override fun init(request: VaadinRequest) {
        content = layout
        layout.addComponent(Label("Welcome"))
    }

}
