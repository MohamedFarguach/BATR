package com.example.demo.mapper;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AppRoleDTO;
import com.example.demo.dto.ChantierDTO;
import com.example.demo.dto.ChauffeurDTO;
import com.example.demo.dto.LieuxDTO;
import com.example.demo.dto.LigneLivraisonDTO;
import com.example.demo.dto.MarqueDTO;
import com.example.demo.dto.ResponsableChargeDTO;
import com.example.demo.dto.TypeLieuxDTO;
import com.example.demo.dto.TypeVehiculeDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.dto.VehiculeDTO;
import com.example.demo.entity.AppRole;
import com.example.demo.entity.Chantier;
import com.example.demo.entity.Chauffeur;
import com.example.demo.entity.Lieux;
import com.example.demo.entity.LigneLivraison;
import com.example.demo.entity.Marque;
import com.example.demo.entity.ResponsableCharge;
import com.example.demo.entity.TypeLieux;
import com.example.demo.entity.TypeVehicule;
import com.example.demo.entity.Users;
import com.example.demo.entity.Vehicule;
import com.example.demo.repositorie.AppRoleRepository;
import com.example.demo.repositorie.ChauffeurRepository;
import com.example.demo.repositorie.LieuxRepository;
import com.example.demo.repositorie.MarqueRepository;
import com.example.demo.repositorie.ResponsableChargeRepository;
import com.example.demo.repositorie.TypeLieuxRepository;
import com.example.demo.repositorie.TypeVehiculeRepository;
import com.example.demo.repositorie.VehiculeRepository;

@Component
@Service
public class MyMapper {
	@Autowired
    private ResponsableChargeRepository responsableChargeRepository;
	@Autowired
	private AppRoleRepository appRoleRepository;
	
	@Autowired
	  private TypeVehiculeRepository typevehiculeRepository;
	@Autowired
	  private TypeLieuxRepository typelieuxRepository;
	@Autowired
	  private LieuxRepository lieuxRepository;
	@Autowired
    private MarqueRepository marqueRepository;
	@Autowired
	  ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	  private ChauffeurRepository chauffeurRepository;
	@Autowired
	  private VehiculeRepository vehiculeRepository;
	
	public LigneLivraisonDTO toLigneLivraisonDTO(LigneLivraison ligneLivraison) {
		
		LigneLivraisonDTO ligneLivraisonDTO = modelMapper.map(ligneLivraison, LigneLivraisonDTO.class);
		
		return ligneLivraisonDTO;
    }
public VehiculeDTO toVehiculeDTO(Vehicule vehicule) {
		
	VehiculeDTO vehiculeDTO = modelMapper.map(vehicule, VehiculeDTO.class);
		
		return vehiculeDTO;
    }
public AppRoleDTO toAppRoleDTO(AppRole appRole) {
	
	AppRoleDTO appRoleDTO = modelMapper.map(appRole, AppRoleDTO.class);
		
		return appRoleDTO;
    }
public TypeLieuxDTO toTypelieuxDTO(TypeLieux typelieux) {
	
	TypeLieuxDTO typelieuxDTO = modelMapper.map(typelieux, TypeLieuxDTO.class);
		
		return typelieuxDTO;
    }
public TypeVehiculeDTO toTypevihiculeDTO(TypeVehicule typevehicule) {
	
	TypeVehiculeDTO typevehiculeDTO = modelMapper.map(typevehicule, TypeVehiculeDTO.class);
		
		return typevehiculeDTO;
    }
public LieuxDTO toLieuxDTO(Lieux lieux) {
	
	LieuxDTO lieuxDTO = modelMapper.map(lieux, LieuxDTO.class);
		
		return lieuxDTO;
    }
public VehiculeDTO FindByVehicule(Optional<Vehicule> vehicule) {
	Optional<Marque> marque = marqueRepository.findById(vehicule.get().getMarques().getId());
	MarqueDTO marqueDTO = new MarqueDTO();
	marqueDTO.setId(marque.get().getId());
	marqueDTO.setMarque(marque.get().getMarque());
	
	Optional<TypeVehicule> typevehicule = typevehiculeRepository.findById(vehicule.get().getTypeVehicule().getId());
	TypeVehiculeDTO typeVehiculeDTO = new TypeVehiculeDTO();
	typeVehiculeDTO=	this.FindByTypeVehicule(typevehicule);
	
	VehiculeDTO vehiculeDTO = modelMapper.map(vehicule, VehiculeDTO.class);
	vehiculeDTO.setId(vehicule.get().getId());
	vehiculeDTO.setMatricule(vehicule.get().getMatricule());
	vehiculeDTO.setNouveauKm(vehicule.get().getNouveauKm());
	vehiculeDTO.setAncienKm(vehicule.get().getAncienKm());
	vehiculeDTO.setStatut(vehicule.get().getStatut());
	vehiculeDTO.setType(vehicule.get().getType());
	vehiculeDTO.setDesignation(vehicule.get().getDesignation());
	vehiculeDTO.setMarques(marqueDTO);
	vehiculeDTO.setTypeVehicule(typeVehiculeDTO);

		return vehiculeDTO;
    }
public VehiculeDTO FindByVehiculeBytype(Optional<Vehicule> vehicule) {
	Optional<Marque> marque = marqueRepository.findById(vehicule.get().getMarques().getId());
	MarqueDTO marqueDTO = new MarqueDTO();
	marqueDTO.setId(marque.get().getId());
	marqueDTO.setMarque(marque.get().getMarque());
	
	Optional<TypeVehicule> typevehicule = typevehiculeRepository.findById(vehicule.get().getTypeVehicule().getId());
	TypeVehiculeDTO typeVehiculeDTO = new TypeVehiculeDTO();
	typeVehiculeDTO=	this.FindByTypeVehicule(typevehicule);
	
	VehiculeDTO vehiculeDTO = modelMapper.map(vehicule, VehiculeDTO.class);
	vehiculeDTO.setId(vehicule.get().getId());
	vehiculeDTO.setMatricule(vehicule.get().getMatricule());
	vehiculeDTO.setNouveauKm(vehicule.get().getNouveauKm());
	vehiculeDTO.setAncienKm(vehicule.get().getAncienKm());
	vehiculeDTO.setStatut(vehicule.get().getStatut());
	vehiculeDTO.setType(vehicule.get().getType());
	vehiculeDTO.setDesignation(vehicule.get().getDesignation());
	vehiculeDTO.setMarques(marqueDTO);
	vehiculeDTO.setTypeVehicule(typeVehiculeDTO);

		return vehiculeDTO;
    }
public LieuxDTO FindByLieux(Optional<Lieux> lieux) {
	Optional<TypeLieux> typelieux = typelieuxRepository.findById(lieux.get().getTypelieux().getId());
	TypeLieuxDTO typeLieuxDTO = new TypeLieuxDTO();
	typeLieuxDTO.setId(typelieux.get().getId());
	typeLieuxDTO.setCode(typelieux.get().getCode());
	typeLieuxDTO.setDesignation(typelieux.get().getDesignation());
	
	
	
	LieuxDTO lieuxDTO = modelMapper.map(lieux, LieuxDTO.class);
	lieuxDTO.setId(lieux.get().getId());
	lieuxDTO.setCode(lieux.get().getCode());
	lieuxDTO.setAdresse(lieux.get().getAdresse());
	lieuxDTO.setDesignation(lieux.get().getDesignation());
	lieuxDTO.setStatut(lieux.get().getStatut());
	lieuxDTO.setType(lieux.get().getType());
	lieuxDTO.setTypelieux(typeLieuxDTO);
		return lieuxDTO;
    }
public UserDTO FindByUsers(Optional<Users> users) {
	Optional<AppRole> role = appRoleRepository.findById(users.get().getAppRole().getId());
	AppRoleDTO approleDTO = new AppRoleDTO();
	approleDTO.setId(role.get().getId());
	approleDTO.setRoleName(role.get().getRoleName());
	
	
	
	UserDTO userDTO = modelMapper.map(users, UserDTO.class);
	userDTO.setId(users.get().getId());
	userDTO.setUsername(users.get().getUsername());
	userDTO.setEmail(users.get().getEmail());
	userDTO.setPrenom(users.get().getPrenom());
	userDTO.setPassword(users.get().getPassword());
	userDTO.setAppRole(approleDTO);
		return userDTO;
    }
public MarqueDTO FindByMarque(Optional<Marque> marque) {
	
	MarqueDTO marqueDTO = modelMapper.map(marque, MarqueDTO.class);
	marqueDTO.setId(marque.get().getId());
	marqueDTO.setMarque(marque.get().getMarque());
		return marqueDTO;
    }
public TypeLieuxDTO FindByTypelieux(Optional<TypeLieux> typeLieux) {
	
	TypeLieuxDTO typeLieuxDTO = modelMapper.map(typeLieux, TypeLieuxDTO.class);
	typeLieuxDTO.setId(typeLieux.get().getId());
	typeLieuxDTO.setCode(typeLieux.get().getCode());
	typeLieuxDTO.setDesignation(typeLieux.get().getDesignation());
		return typeLieuxDTO;
    }
public TypeVehiculeDTO FindByTypeVehicule(Optional<TypeVehicule> typeVehicule) {
	
	TypeVehiculeDTO typeVehiculeDTO = modelMapper.map(typeVehicule, TypeVehiculeDTO.class);
	typeVehiculeDTO.setId(typeVehicule.get().getId());
	typeVehiculeDTO.setType(typeVehicule.get().getType());
		return typeVehiculeDTO;
    }
public ChantierDTO toChantierDTO(Chantier chantier) {
	
	ChantierDTO chantierDTO = modelMapper.map(chantier, ChantierDTO.class);
		
		return chantierDTO;
    }
public ChauffeurDTO toChauffeurDTO(Chauffeur chauffeur) {
	
	ChauffeurDTO chauffeurDTO = modelMapper.map(chauffeur, ChauffeurDTO.class);
		
		return chauffeurDTO;
    }
public ResponsableChargeDTO toResponsableChargDTO(ResponsableCharge responsableCharg) {
	
	ResponsableChargeDTO responsableChargeDTO = modelMapper.map(responsableCharg, ResponsableChargeDTO.class);
		
		return responsableChargeDTO;
    }
public MarqueDTO toMarqueDTO(Marque marque) {
	
	MarqueDTO marqueDTO = modelMapper.map(marque, MarqueDTO.class);
		
		return marqueDTO;
    }
public ChauffeurDTO toChauffeurDTO2(Optional<Chauffeur> chauffeur) {
	
	ChauffeurDTO chauffeurDTO = modelMapper.map(chauffeur, ChauffeurDTO.class);
	
	chauffeurDTO.setId(chauffeur.get().getId());
	chauffeurDTO.setMatricule(chauffeur.get().getMatricule());
	chauffeurDTO.setNom(chauffeur.get().getNom());
	chauffeurDTO.setPrenom(chauffeur.get().getPrenom());
	chauffeurDTO.setTelephone(chauffeur.get().getTelephone());
		return chauffeurDTO;
    }
public ResponsableChargeDTO toResponsableChargeDTO(Optional<ResponsableCharge> responsableCharge) {
	
	ResponsableChargeDTO responsableChargeDTO = modelMapper.map(responsableCharge, ResponsableChargeDTO.class);
	
	responsableChargeDTO.setId(responsableCharge.get().getId());
	responsableChargeDTO.setMatricule(responsableCharge.get().getMatricule());
	responsableChargeDTO.setNom(responsableCharge.get().getNom());
	responsableChargeDTO.setPrenom(responsableCharge.get().getPrenom());
	responsableChargeDTO.setTelephone(responsableCharge.get().getTelephone());
		return responsableChargeDTO;
    } 
public LigneLivraisonDTO FindLivraisonDTO(Optional<LigneLivraison> ligneLivraison) {
	Optional<TypeVehicule> typeVehicule = typevehiculeRepository.findById(ligneLivraison.get().getTypeVehicule().getId());
	TypeVehiculeDTO typevehiculeDTO = new  TypeVehiculeDTO();
	typevehiculeDTO = this.FindByTypeVehicule(typeVehicule);
	
	Optional<ResponsableCharge> responsableCharge = responsableChargeRepository.findById(ligneLivraison.get().getResponsableCharge().getId());
	ResponsableChargeDTO responsableChargeDTO = new ResponsableChargeDTO();
	responsableChargeDTO.setId(responsableCharge.get().getId());
	responsableChargeDTO.setNom(responsableCharge.get().getNom());
	responsableChargeDTO.setMatricule(responsableCharge.get().getMatricule());
	responsableChargeDTO.setPrenom(responsableCharge.get().getPrenom());
	responsableChargeDTO.setTelephone(responsableCharge.get().getTelephone());
	
	Optional<Lieux> lieux = lieuxRepository.findById(ligneLivraison.get().getLieuxlivraison().getId());
	LieuxDTO lieuxDTO = new LieuxDTO();
	lieuxDTO=	this.FindByLieux(lieux);
	Optional<Lieux> lieuxcharge = lieuxRepository.findById(ligneLivraison.get().getLieucharge().getId());
	LieuxDTO lieuxchargeDTO = new LieuxDTO();
	lieuxchargeDTO=	this.FindByLieux(lieuxcharge);
	
	Optional<Chauffeur> chaufeur = chauffeurRepository.findById(ligneLivraison.get().getChauffeur().getId());	
	ChauffeurDTO chauffeurDTO = new ChauffeurDTO();
	chauffeurDTO.setId(chaufeur.get().getId());
	chauffeurDTO.setNom(chaufeur.get().getNom());
	chauffeurDTO.setMatricule(chaufeur.get().getMatricule());
	chauffeurDTO.setPrenom(chaufeur.get().getPrenom());
	chauffeurDTO.setTelephone(chaufeur.get().getTelephone());
	
	Optional<Vehicule> vehicule = vehiculeRepository.findById(ligneLivraison.get().getVehicule().getId());
	VehiculeDTO vehiculeDTO = new VehiculeDTO();
	vehiculeDTO =	this.FindByVehicule(vehicule);
	
	
	LigneLivraisonDTO ligneLivraisonDTO = modelMapper.map(ligneLivraison, LigneLivraisonDTO.class);

	 ligneLivraisonDTO.setId(ligneLivraison.get().getId());
	  ligneLivraisonDTO.setDateDemande(ligneLivraison.get().getDateDemande());
	  ligneLivraisonDTO.setDateLivraison(ligneLivraison.get().getDateLivraison());
	  ligneLivraisonDTO.setDatePrevuCharge(ligneLivraison.get().getDatePrevuCharge());
	  ligneLivraisonDTO.setDesignation(ligneLivraison.get().getDesignation());	
	  ligneLivraisonDTO.setNote(ligneLivraison.get().getNote());
	  ligneLivraisonDTO.setQuantite(ligneLivraison.get().getQuantite());
	  ligneLivraisonDTO.setStatut(ligneLivraison.get().getStatut());
	  ligneLivraisonDTO.setUnite(ligneLivraison.get().getUnite());
	  ligneLivraisonDTO.setVehicule(vehiculeDTO);
	  ligneLivraisonDTO.setChauffeur(chauffeurDTO);
	  ligneLivraisonDTO.setTypeVehicule(typevehiculeDTO);
	  ligneLivraisonDTO.setLieuxlivraison(lieuxDTO);
	  ligneLivraisonDTO.setLieucharge(lieuxchargeDTO);
	  ligneLivraisonDTO.setResponsableCharge(responsableChargeDTO);
      
		return ligneLivraisonDTO;
    }
public UserDTO toUserDTO(Users user) {
	
	UserDTO userDTO = modelMapper.map(user, UserDTO.class);
		
		return userDTO;
    }

}
