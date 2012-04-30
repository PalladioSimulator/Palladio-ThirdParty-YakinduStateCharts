package org.yakindu.sct.model.sexec.transformation;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.EObjectExtensions;
import org.yakindu.sct.model.sexec.ExecutionFlow;
import org.yakindu.sct.model.sexec.ExecutionRegion;
import org.yakindu.sct.model.sexec.ExecutionState;
import org.yakindu.sct.model.sexec.SexecFactory;
import org.yakindu.sct.model.sexec.StateVector;
import org.yakindu.sct.model.sexec.transformation.SexecElementMapping;
import org.yakindu.sct.model.sexec.transformation.SexecExtensions;
import org.yakindu.sct.model.sexec.transformation.SgraphExtensions;
import org.yakindu.sct.model.sexec.transformation.StatechartExtensions;
import org.yakindu.sct.model.sgraph.Choice;
import org.yakindu.sct.model.sgraph.FinalState;
import org.yakindu.sct.model.sgraph.Region;
import org.yakindu.sct.model.sgraph.RegularState;
import org.yakindu.sct.model.sgraph.State;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.sgraph.Vertex;

@SuppressWarnings("all")
public class StateVectorBuilder {
  
  @Inject
  private SexecExtensions sexec;
  
  @Inject
  private SexecElementMapping mapping;
  
  @Inject
  private StatechartExtensions sc;
  
  @Inject
  private SgraphExtensions sgraph;
  
  public Object defineHistoryVector(final ExecutionFlow flow, final Statechart sc) {
    Object _xblockexpression = null;
    {
      int _operator_minus = IntegerExtensions.operator_minus(1);
      int offset = _operator_minus;
      Iterable<EObject> _allContentsIterable = EObjectExtensions.allContentsIterable(sc);
      Iterable<Region> _filter = IterableExtensions.<Region>filter(_allContentsIterable, org.yakindu.sct.model.sgraph.Region.class);
      for (final Region r : _filter) {
        boolean _requireHistory = this.sgraph.requireHistory(r);
        if (_requireHistory) {
          {
            int _operator_plus = IntegerExtensions.operator_plus(((Integer)offset), ((Integer)1));
            offset = _operator_plus;
            ExecutionRegion _create = this.mapping.create(r);
            final ExecutionRegion er = _create;
            SexecFactory _factory = this.sexec.factory();
            StateVector _createStateVector = _factory.createStateVector();
            er.setHistoryVector(_createStateVector);
            StateVector _historyVector = er.getHistoryVector();
            _historyVector.setOffset(offset);
            StateVector _historyVector_1 = er.getHistoryVector();
            _historyVector_1.setSize(1);
          }
        }
      }
      Object _xifexpression = null;
      int _operator_minus_1 = IntegerExtensions.operator_minus(1);
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Integer)offset), ((Integer)_operator_minus_1));
      if (_operator_notEquals) {
        {
          SexecFactory _factory_1 = this.sexec.factory();
          StateVector _createStateVector_1 = _factory_1.createStateVector();
          flow.setHistoryVector(_createStateVector_1);
          StateVector _historyVector_2 = flow.getHistoryVector();
          _historyVector_2.setOffset(0);
          StateVector _historyVector_3 = flow.getHistoryVector();
          int _operator_plus_1 = IntegerExtensions.operator_plus(((Integer)offset), ((Integer)1));
          _historyVector_3.setSize(_operator_plus_1);
        }
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public void defineStateVector(final ExecutionFlow flow, final Statechart sc) {
    {
      int offset = 0;
      EList<Region> _regions = sc.getRegions();
      for (final Region r : _regions) {
        int _defineStateVectors = this.defineStateVectors(r, offset);
        int _operator_plus = IntegerExtensions.operator_plus(((Integer)offset), ((Integer)_defineStateVectors));
        offset = _operator_plus;
      }
      SexecFactory _factory = this.sexec.factory();
      StateVector _createStateVector = _factory.createStateVector();
      flow.setStateVector(_createStateVector);
      StateVector _stateVector = flow.getStateVector();
      _stateVector.setOffset(0);
      StateVector _stateVector_1 = flow.getStateVector();
      _stateVector_1.setSize(offset);
    }
  }
  
  public int defineStateVectors(final Statechart sc, final int offset) {
    EList<Region> _regions = sc.getRegions();
    final Function2<Integer,Region,Integer> _function = new Function2<Integer,Region,Integer>() {
        public Integer apply(final Integer o , final Region r) {
          int _maxOrthogonality = StateVectorBuilder.this.sc.maxOrthogonality(r);
          int _operator_plus = IntegerExtensions.operator_plus(((Integer)_maxOrthogonality), o);
          return ((Integer)_operator_plus);
        }
      };
    Integer _fold = IterableExtensions.<Region, Integer>fold(_regions, ((Integer)0), _function);
    return _fold;
  }
  
  public int defineStateVectors(final Region r, final int offset) {
    {
      EList<Vertex> _vertices = r.getVertices();
      final Function2<Integer,Vertex,Integer> _function = new Function2<Integer,Vertex,Integer>() {
          public Integer apply(final Integer s , final Vertex v) {
            int _xblockexpression = (int) 0;
            {
              int _defineStateVectors = StateVectorBuilder.this.defineStateVectors(v, ((Integer)offset));
              final int mo = _defineStateVectors;
              int _xifexpression = (int) 0;
              boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)mo), s);
              if (_operator_greaterThan) {
                _xifexpression = mo;
              } else {
                _xifexpression = s;
              }
              _xblockexpression = (_xifexpression);
            }
            return ((Integer)_xblockexpression);
          }
        };
      Integer _fold = IterableExtensions.<Vertex, Integer>fold(_vertices, ((Integer)0), _function);
      final Integer maxOrthogonality = _fold;
      ExecutionRegion _create = this.mapping.create(r);
      final ExecutionRegion er = _create;
      SexecFactory _factory = this.sexec.factory();
      StateVector _createStateVector = _factory.createStateVector();
      er.setStateVector(_createStateVector);
      StateVector _stateVector = er.getStateVector();
      _stateVector.setOffset(offset);
      StateVector _stateVector_1 = er.getStateVector();
      _stateVector_1.setSize(maxOrthogonality);
      return maxOrthogonality;
    }
  }
  
  protected int _defineStateVectors(final Vertex v, final int offset) {
    return 0;
  }
  
  protected int _defineStateVectors(final State s, final int offset) {
    {
      int maxOrthogonality = 0;
      EList<Region> _regions = s.getRegions();
      int _size = _regions.size();
      boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_size), ((Integer)0));
      if (_operator_greaterThan) {
        EList<Region> _regions_1 = s.getRegions();
        for (final Region r : _regions_1) {
          int _operator_plus = IntegerExtensions.operator_plus(((Integer)offset), ((Integer)maxOrthogonality));
          int _defineStateVectors = this.defineStateVectors(r, _operator_plus);
          int _operator_plus_1 = IntegerExtensions.operator_plus(((Integer)maxOrthogonality), ((Integer)_defineStateVectors));
          maxOrthogonality = _operator_plus_1;
        }
      } else {
        maxOrthogonality = 1;
      }
      ExecutionState _create = this.mapping.create(s);
      final ExecutionState es = _create;
      SexecFactory _factory = this.sexec.factory();
      StateVector _createStateVector = _factory.createStateVector();
      es.setStateVector(_createStateVector);
      StateVector _stateVector = es.getStateVector();
      _stateVector.setOffset(offset);
      StateVector _stateVector_1 = es.getStateVector();
      _stateVector_1.setSize(maxOrthogonality);
      return maxOrthogonality;
    }
  }
  
  protected int _defineStateVectors(final FinalState s, final int offset) {
    {
      ExecutionState _create = this.mapping.create(s);
      final ExecutionState es = _create;
      SexecFactory _factory = this.sexec.factory();
      StateVector _createStateVector = _factory.createStateVector();
      es.setStateVector(_createStateVector);
      StateVector _stateVector = es.getStateVector();
      _stateVector.setOffset(offset);
      StateVector _stateVector_1 = es.getStateVector();
      _stateVector_1.setSize(1);
      return 1;
    }
  }
  
  protected StateVector _stateVector(final Vertex v) {
    return null;
  }
  
  protected StateVector _stateVector(final RegularState s) {
    ExecutionState _create = this.mapping.create(s);
    StateVector _stateVector = _create.getStateVector();
    return _stateVector;
  }
  
  protected StateVector _stateVector(final Choice choice) {
    Region _parentRegion = choice.getParentRegion();
    ExecutionRegion _create = this.mapping.create(_parentRegion);
    StateVector _stateVector = _create.getStateVector();
    return _stateVector;
  }
  
  public int defineStateVectors(final Vertex s, final Integer offset) {
    if ((s instanceof FinalState)
         && (offset instanceof Integer)) {
      return _defineStateVectors((FinalState)s, (Integer)offset);
    } else if ((s instanceof State)
         && (offset instanceof Integer)) {
      return _defineStateVectors((State)s, (Integer)offset);
    } else if ((s instanceof Vertex)
         && (offset instanceof Integer)) {
      return _defineStateVectors((Vertex)s, (Integer)offset);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(s, offset).toString());
    }
  }
  
  public StateVector stateVector(final Vertex choice) {
    if ((choice instanceof Choice)) {
      return _stateVector((Choice)choice);
    } else if ((choice instanceof RegularState)) {
      return _stateVector((RegularState)choice);
    } else if ((choice instanceof Vertex)) {
      return _stateVector((Vertex)choice);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(choice).toString());
    }
  }
}