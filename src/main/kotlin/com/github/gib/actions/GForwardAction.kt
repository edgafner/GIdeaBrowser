package com.github.gib.actions

import com.intellij.ide.actions.ForwardAction
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.ui.jcef.JBCefBrowser
import javax.swing.Icon

class GForwardAction(private val jbCefBrowser: JBCefBrowser, icon: Icon) : AnAction(icon) {

    override fun update(e: AnActionEvent) {
        if (!jbCefBrowser.cefBrowser.canGoForward()) {
            e.presentation.isEnabled = false
            return
        }
        super.update(e)

    }

    override fun actionPerformed(e: AnActionEvent) {
        jbCefBrowser.cefBrowser.goForward()
    }
}