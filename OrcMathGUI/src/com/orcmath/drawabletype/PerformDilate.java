/*******************************************************************************
 * Copyright (c) 2012-2017 Benjamin Nockles
 *
 * This file is part of OrcMath.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License 
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package com.orcmath.drawabletype;

import com.orcmath.drawable.Dilation;

public class PerformDilate extends PerformTransform{

	double angle;
	
	public PerformDilate(){
		instructions = "";
		numberOfColumns=1;
		verticalSpacing=0;	
		whetherInstructionsAreNeverIncluded=true;
	}
	
	public PerformDilate(int difficulty){
		instructions = "";
		numberOfColumns=1;
		verticalSpacing=0;	
		whetherInstructionsAreNeverIncluded=true;
		this.difficulty=difficulty;
		addTransformation(new Dilation());
		getInstance();
	}

	

}
