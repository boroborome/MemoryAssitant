/*
 * <P>Title:      任务管理器模型 V1.0</P>
 * <P>Description:[描述功能、作用、用法和注意事项]</P>
 * <P>Copyright:  Copyright (c) 2008</P>
 * <P>Company:    BoRoBoRoMe Co. Ltd.</P>
 * @author        BoRoBoRoMe
 * @version       1.0 2011-10-6
 */
package com.boroborome.footstone.svc;

/**
 * <DT><B>Title:</B></DT>
 *    <DD>任务管理模型</DD>
 * <DT><B>Description:</B></DT>
 *    <DD>生成ID的工具。生成的ID是自增长的</DD>
 * <P>Copyright:  Copyright (c) 2008</P>
 * <P>Company:    BoRoBoRoMe Co. Ltd.</P>
 * @author        BoRoBoRoMe
 * @version       1.0 2011-10-6
 */
public interface IIDGeneratorSvc
{
	<E> void init(Class<E> type, IAutoIDDataSvc<E> svc);
    /**
     * 初始化某一个类型的索引
     * @param type
     * @param startIndex 开始索引，nextIndex的返回结果从startIndex的下一个开始
     */
    void init(Class<?> type, long startIndex);
    
    /**
     * 获取一个索引
     * @param type
     * @return
     */
    long nextIndex(Class<?> type);
}
