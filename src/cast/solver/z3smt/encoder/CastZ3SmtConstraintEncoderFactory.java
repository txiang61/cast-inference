package cast.solver.z3smt.encoder;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;

import backend.z3smt.encoder.Z3SmtConstraintEncoderFactory;
import cast.representation.TypeCheckCast;
import cast.solver.z3smt.CastZ3SmtFormatTranslator;
import cast.solver.z3smt.representation.Z3InferenceCast;
import checkers.inference.solver.backend.encoder.ArithmeticConstraintEncoder;
import checkers.inference.solver.backend.encoder.binary.ComparableConstraintEncoder;
import checkers.inference.solver.backend.encoder.binary.EqualityConstraintEncoder;
import checkers.inference.solver.backend.encoder.binary.InequalityConstraintEncoder;
import checkers.inference.solver.backend.encoder.binary.SubtypeConstraintEncoder;
import checkers.inference.solver.backend.encoder.combine.CombineConstraintEncoder;
import checkers.inference.solver.backend.encoder.existential.ExistentialConstraintEncoder;
import checkers.inference.solver.backend.encoder.implication.ImplicationConstraintEncoder;
import checkers.inference.solver.backend.encoder.preference.PreferenceConstraintEncoder;
import checkers.inference.solver.frontend.Lattice;

public class CastZ3SmtConstraintEncoderFactory 
	extends Z3SmtConstraintEncoderFactory<Z3InferenceCast, TypeCheckCast, CastZ3SmtFormatTranslator> {

	public CastZ3SmtConstraintEncoderFactory(Lattice lattice, Context ctx,
			CastZ3SmtFormatTranslator z3SmtFormatTranslator) {
		super(lattice, ctx, z3SmtFormatTranslator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SubtypeConstraintEncoder<BoolExpr> createSubtypeConstraintEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EqualityConstraintEncoder<BoolExpr> createEqualityConstraintEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InequalityConstraintEncoder<BoolExpr> createInequalityConstraintEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComparableConstraintEncoder<BoolExpr> createComparableConstraintEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreferenceConstraintEncoder<BoolExpr> createPreferenceConstraintEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CombineConstraintEncoder<BoolExpr> createCombineConstraintEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExistentialConstraintEncoder<BoolExpr> createExistentialConstraintEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImplicationConstraintEncoder<BoolExpr> createImplicationConstraintEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArithmeticConstraintEncoder<BoolExpr> createArithmeticConstraintEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

}
