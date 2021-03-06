/**
 *
 */
package com.happy3w.memoryassistant.model;

import com.happy3w.footstone.svc.IDataCondition;

import java.util.List;

/**
 * @author boroborome
 *
 */
public class MAInformationCondition implements IDataCondition<MAInformation> {
    /**
     * Query all the information with all this keyword
     */
    private List<MAKeyword> lstKeyword;

    /**
     *
     */
    public MAInformationCondition() {
        super();
    }

    /**
     * @return the lstKeyword
     */
    public List<MAKeyword> getLstKeyword() {
        return lstKeyword;
    }

    /**
     * @param lstKeyword the lstKeyword to set
     */
    public void setLstKeyword(List<MAKeyword> lstKeyword) {
        this.lstKeyword = lstKeyword;
    }

}
