package com.pharmacies.dto;

public class EmergencyPharmacyRSDTO {

    private String localNombre;
    private String localDireccion;
    private String localTelefono;
    private String localLat;
    private String localLng;
    
	public String getLocalNombre() {
		return localNombre;
	}
	public void setLocalNombre(String localNombre) {
		this.localNombre = localNombre;
	}
	public String getLocalDireccion() {
		return localDireccion;
	}
	public void setLocalDireccion(String localDireccion) {
		this.localDireccion = localDireccion;
	}
	public String getLocalTelefono() {
		return localTelefono;
	}
	public void setLocalTelefono(String localTelefono) {
		this.localTelefono = localTelefono;
	}
	public String getLocalLat() {
		return localLat;
	}
	public void setLocalLat(String localLat) {
		this.localLat = localLat;
	}
	public String getLocalLng() {
		return localLng;
	}
	public void setLocalLng(String localLng) {
		this.localLng = localLng;
	}
	
	@Override
	public String toString() {
		return "EmergencyPharmacyRSDTO [localNombre=" + localNombre + ", localDireccion=" + localDireccion
				+ ", localTelefono=" + localTelefono + ", localLat=" + localLat + ", localLng=" + localLng + "]";
	}

}
