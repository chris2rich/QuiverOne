package com.lukflug.panelstudio.tabgui;

import com.lukflug.panelstudio.Component;

public interface TabGUIComponent extends Component {
   boolean isActive();

   boolean select();
}
