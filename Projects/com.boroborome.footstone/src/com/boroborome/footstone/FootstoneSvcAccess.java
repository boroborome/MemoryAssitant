/*
 * <P>Title:      基石模块</P>
 * <P>Description:[描述功能、作用、用法和注意事项]</P>
 * <P>Copyright:  Copyright (c) 2008</P>
 * <P>Company:    BoRoBoRoMe Co. Ltd.</P>
 * @author        BoRoBoRoMe
 * @version       1.0 2011-7-7
 */
package com.boroborome.footstone;

import com.boroborome.footstone.bundle.Activator;
import com.boroborome.footstone.exception.IExceptionGrave;
import com.boroborome.footstone.resource.IResourceMgrSvc;

/**
 * <DT><B>Title:</B></DT>
 *    <DD>基石</DD>
 * <DT><B>Description:</B></DT>
 *    <DD>基石服务提供器<br>
 *    对外提供方便的获取基石对外提供服务的方法。</DD>
 * <P>Copyright:  Copyright (c) 2008</P>
 * <P>Company:    BoRoBoRoMe Co. Ltd.</P>
 * @author        BoRoBoRoMe
 * @version       1.0 2011-7-7
 */
public final class FootstoneSvcAccess
{
    /**
     * 获取异常处理
     * @return
     */
    public static IExceptionGrave getExceptionGrave()
    {
        return (IExceptionGrave) Activator.getService(IExceptionGrave.class.getName());
    }
    
    /**
     * 获取资源管理服务
     * @return
     */
    public static IResourceMgrSvc getResourceMgrSvc()
    {
        return (IResourceMgrSvc) Activator.getService(IResourceMgrSvc.class.getName());
    }
}
