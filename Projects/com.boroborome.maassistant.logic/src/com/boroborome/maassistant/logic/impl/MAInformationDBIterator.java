/**
 * 
 */
package com.boroborome.maassistant.logic.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.boroborme.maassistant.model.MAInformation;
import com.boroborome.footstone.model.AbstractDBIterator;

/**
 * @author boroborome
 *
 */
public class MAInformationDBIterator extends AbstractDBIterator<MAInformation>
{

	public MAInformationDBIterator(ResultSet rs)
	{
		super(rs);
	}

	@Override
	public MAInformation adapterValue(ResultSet rs) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

}
