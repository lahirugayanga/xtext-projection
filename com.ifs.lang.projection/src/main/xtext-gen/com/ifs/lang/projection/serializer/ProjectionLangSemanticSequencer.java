/*
 * generated by Xtext 2.16.0
 */
package com.ifs.lang.projection.serializer;

import com.google.inject.Inject;
import com.ifs.lang.projection.projectionLang.Category;
import com.ifs.lang.projection.projectionLang.Component;
import com.ifs.lang.projection.projectionLang.Description;
import com.ifs.lang.projection.projectionLang.Entityset;
import com.ifs.lang.projection.projectionLang.Layer;
import com.ifs.lang.projection.projectionLang.Model;
import com.ifs.lang.projection.projectionLang.Projection;
import com.ifs.lang.projection.projectionLang.ProjectionLangPackage;
import com.ifs.lang.projection.services.ProjectionLangGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ProjectionLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProjectionLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProjectionLangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProjectionLangPackage.CATEGORY:
				sequence_Category(context, (Category) semanticObject); 
				return; 
			case ProjectionLangPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case ProjectionLangPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case ProjectionLangPackage.ENTITYSET:
				sequence_Entityset(context, (Entityset) semanticObject); 
				return; 
			case ProjectionLangPackage.LAYER:
				sequence_Layer(context, (Layer) semanticObject); 
				return; 
			case ProjectionLangPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ProjectionLangPackage.PROJECTION:
				sequence_Projection(context, (Projection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Type returns Category
	 *     Category returns Category
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Category(ISerializationContext context, Category semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Description
	 *     Description returns Description
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Entityset
	 *     Entityset returns Entityset
	 *
	 * Constraint:
	 *     (name=ID entity=ID)
	 */
	protected void sequence_Entityset(ISerializationContext context, Entityset semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, ProjectionLangPackage.Literals.ENTITYSET__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectionLangPackage.Literals.ENTITYSET__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntitysetAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEntitysetAccess().getEntityIDTerminalRuleCall_3_0(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Layer
	 *     Layer returns Layer
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Layer(ISerializationContext context, Layer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=Type+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Projection
	 *     Projection returns Projection
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Projection(ISerializationContext context, Projection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectionLangPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProjectionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
