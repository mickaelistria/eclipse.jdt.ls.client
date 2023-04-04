/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc.. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package com.redhat.eclipseide.jdtlsclient;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class JDTLSPrefrencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(JDTLSClientPlugin.getInstance().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {
		addField(new DirectoryFieldEditor(JDTLSProductConnectionProvider.PREF_LOCATION, "Language Server location", getFieldEditorParent()));
	}

}
