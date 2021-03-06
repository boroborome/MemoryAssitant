/*
 * <P>Title:      [产品名称和版本号]</P>
 * <P>Description:[描述功能、作用、用法和注意事项]</P>
 * <P>Copyright:  Copyright (c) 2008</P>
 * <P>Company:    BoRoBoRoMe Co. Ltd.</P>
 * @author        BoRoBoRoMe
 * @version       1.0 2010-3-8
 * @see           [相关类，可选，也可多条]
 * @since         [产品/模块版本，表示从哪个版本开始有]
 * @!deprecated   [表示不建议使用]
 * @modify        [修改记录，可多条，每次修改后增加说明。只包括重要修改，修改人、时间、单号、版本、内容]
 */
package com.boroborome.footstone.dataenergy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <DT><B>Title:</B></DT>
 *    <DD>序列属性标记</DD>
 * <DT><B>Description:</B></DT>
 *    <DD>在对象数据引擎中用于表示这个属性需要提供给数据机器。如果一个get/is方法带有这个标记，则这个属性的值会提供给数据机器。</DD>
 * <P>Copyright:  Copyright (c) 2008</P>
 * <P>Company:    BoRoBoRoMe Co. Ltd.</P>
 * @author        BoRoBoRoMe
 * @version       1.0 2010-3-8
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SerialAttribute
{
    //标记属性没有内容
}
