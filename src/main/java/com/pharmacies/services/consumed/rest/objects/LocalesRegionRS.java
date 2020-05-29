
package com.pharmacies.services.consumed.rest.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocalesRegionRS {

	@SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("local_id")
    @Expose
    private String localId;
    @SerializedName("local_nombre")
    @Expose
    private String localNombre;
    @SerializedName("comuna_nombre")
    @Expose
    private String comunaNombre;
    @SerializedName("localidad_nombre")
    @Expose
    private String localidadNombre;
    @SerializedName("local_direccion")
    @Expose
    private String localDireccion;
    @SerializedName("funcionamiento_hora_apertura")
    @Expose
    private String funcionamientoHoraApertura;
    @SerializedName("funcionamiento_hora_cierre")
    @Expose
    private String funcionamientoHoraCierre;
    @SerializedName("local_telefono")
    @Expose
    private String localTelefono;
    @SerializedName("local_lat")
    @Expose
    private String localLat;
    @SerializedName("local_lng")
    @Expose
    private String localLng;
    @SerializedName("funcionamiento_dia")
    @Expose
    private String funcionamientoDia;
    @SerializedName("fk_region")
    @Expose
    private String fkRegion;
    @SerializedName("fk_comuna")
    @Expose
    private String fkComuna;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public String getLocalNombre() {
        return localNombre;
    }

    public void setLocalNombre(String localNombre) {
        this.localNombre = localNombre;
    }

    public String getComunaNombre() {
        return comunaNombre;
    }

    public void setComunaNombre(String comunaNombre) {
        this.comunaNombre = comunaNombre;
    }

    public String getLocalidadNombre() {
        return localidadNombre;
    }

    public void setLocalidadNombre(String localidadNombre) {
        this.localidadNombre = localidadNombre;
    }

    public String getLocalDireccion() {
        return localDireccion;
    }

    public void setLocalDireccion(String localDireccion) {
        this.localDireccion = localDireccion;
    }

    public String getFuncionamientoHoraApertura() {
        return funcionamientoHoraApertura;
    }

    public void setFuncionamientoHoraApertura(String funcionamientoHoraApertura) {
        this.funcionamientoHoraApertura = funcionamientoHoraApertura;
    }

    public String getFuncionamientoHoraCierre() {
        return funcionamientoHoraCierre;
    }

    public void setFuncionamientoHoraCierre(String funcionamientoHoraCierre) {
        this.funcionamientoHoraCierre = funcionamientoHoraCierre;
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

    public String getFuncionamientoDia() {
        return funcionamientoDia;
    }

    public void setFuncionamientoDia(String funcionamientoDia) {
        this.funcionamientoDia = funcionamientoDia;
    }

    public String getFkRegion() {
        return fkRegion;
    }

    public void setFkRegion(String fkRegion) {
        this.fkRegion = fkRegion;
    }

    public String getFkComuna() {
        return fkComuna;
    }

    public void setFkComuna(String fkComuna) {
        this.fkComuna = fkComuna;
    }

    @Override
	public String toString() {
		return "LocalesRegionRS [fecha=" + fecha + ", localId=" + localId + ", localNombre=" + localNombre
				+ ", comunaNombre=" + comunaNombre + ", localidadNombre=" + localidadNombre + ", localDireccion="
				+ localDireccion + ", funcionamientoHoraApertura=" + funcionamientoHoraApertura
				+ ", funcionamientoHoraCierre=" + funcionamientoHoraCierre + ", localTelefono=" + localTelefono
				+ ", localLat=" + localLat + ", localLng=" + localLng + ", funcionamientoDia=" + funcionamientoDia
				+ ", fkRegion=" + fkRegion + ", fkComuna=" + fkComuna + "]";
	}

}
