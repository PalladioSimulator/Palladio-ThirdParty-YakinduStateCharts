/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 *
 */
package org.yakindu.sct.ui.editor.preferences;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;

/**
 *
 * @author andreas muelder
 *
 */
public interface StatechartColorConstants {
	Color CANVAS_BG_COLOR = new Color(null, 245, 245, 245);

	Color STATE_BG_COLOR = new Color(null, 205, 220, 243);

	Color REGION_BG_COLOR = ColorConstants.white;

	Color STATE_LINE_COLOR = new Color(null, 163, 163, 163);

	Color REGION_LINE_COLOR = ColorConstants.lightGray;

}
