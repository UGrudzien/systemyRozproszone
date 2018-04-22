// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `Calc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public final class CalcHolder extends Ice.ObjectHolderBase<Calc>
{
    public
    CalcHolder()
    {
    }

    public
    CalcHolder(Calc value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof Calc)
        {
            value = (Calc)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _CalcDisp.ice_staticId();
    }
}
