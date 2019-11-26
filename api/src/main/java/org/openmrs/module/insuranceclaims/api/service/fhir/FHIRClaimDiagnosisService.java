package org.openmrs.module.insuranceclaims.api.service.fhir;

import org.hl7.fhir.dstu3.model.Claim;
import org.openmrs.module.insuranceclaims.api.dao.InsuranceClaimDiagnosisDao;
import org.openmrs.module.insuranceclaims.api.model.InsuranceClaim;
import org.openmrs.module.insuranceclaims.api.model.InsuranceClaimDiagnosis;

import java.util.List;

public interface FHIRClaimDiagnosisService {

    Claim.DiagnosisComponent generateClaimDiagnosisComponent(InsuranceClaimDiagnosis omrsClaimDiagnosis);

    List<Claim.DiagnosisComponent> generateClaimDiagnosisComponent(List<InsuranceClaimDiagnosis> omrsClaimDiagnosis);

    List<Claim.DiagnosisComponent> generateClaimDiagnosisComponent(InsuranceClaim omrsInsuranceClaim);

    InsuranceClaimDiagnosis createOmrsClaimDiagnosis(Claim.DiagnosisComponent claimDiagnosis, List<String> errors);

    void setDiagnosisDao(InsuranceClaimDiagnosisDao dao);
}
