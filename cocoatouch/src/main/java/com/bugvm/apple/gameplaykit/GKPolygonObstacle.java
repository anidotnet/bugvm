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
package com.bugvm.apple.gameplaykit;

/*<imports>*/

import com.bugvm.apple.foundation.VectorFloat2;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKPolygonObstacle/*</name>*/ 
    extends /*<extends>*/GKObstacle/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKPolygonObstaclePtr extends Ptr<GKPolygonObstacle, GKPolygonObstaclePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKPolygonObstacle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKPolygonObstacle() {}
    protected GKPolygonObstacle(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public GKPolygonObstacle(VectorFloat2[] points) {
        super((SkipInit) null);
        VectorFloat2.VectorFloat2Ptr ptr = new VectorFloat2.VectorFloat2Ptr();
        ptr.set(points);
        initObject(init(ptr, points.length));
    }
    /*<properties>*/
    @Property(selector = "vertexCount")
    public native @MachineSizedUInt long getVertexCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPoints:count:")
    protected native @Pointer long init(VectorFloat2.VectorFloat2Ptr points, @MachineSizedUInt long numPoints);
    @Method(selector = "vertexAtIndex:")
    public native VectorFloat2 getVertex(@MachineSizedUInt long index);
    /*</methods>*/
}