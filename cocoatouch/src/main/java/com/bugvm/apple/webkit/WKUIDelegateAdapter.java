/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.webkit;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.NotImplemented;
import com.bugvm.objc.block.VoidBlock1;
import com.bugvm.objc.block.VoidBooleanBlock;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKUIDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*/implements WKUIDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:")
    public WKWebView createWebView(WKWebView webView, WKWebViewConfiguration configuration, WKNavigationAction navigationAction, WKWindowFeatures windowFeatures) { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("webViewDidClose:")
    public void didClose(WKWebView webView) {}
    @NotImplemented("webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:")
    public void runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame, @Block Runnable completionHandler) {}
    @NotImplemented("webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:")
    public void runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame, @Block VoidBooleanBlock completionHandler) {}
    @NotImplemented("webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:")
    public void runJavaScriptTextInputPanel(WKWebView webView, String prompt, String defaultText, WKFrameInfo frame, @Block VoidBlock1<String> completionHandler) {}
    /*</methods>*/
}