/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSoftBodyFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btSoftBodyFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btSoftBodyFloatData(long cPtr, boolean cMemoryOwn) {
		this("btSoftBodyFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btSoftBodyFloatData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btSoftBodyFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setCollisionObjectData(btCollisionObjectFloatData value) {
    gdxBulletJNI.btSoftBodyFloatData_collisionObjectData_set(swigCPtr, this, btCollisionObjectFloatData.getCPtr(value), value);
  }

  public btCollisionObjectFloatData getCollisionObjectData() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_collisionObjectData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionObjectFloatData(cPtr, false);
  }

  public void setPose(SoftBodyPoseData value) {
    gdxBulletJNI.btSoftBodyFloatData_pose_set(swigCPtr, this, SoftBodyPoseData.getCPtr(value), value);
  }

  public SoftBodyPoseData getPose() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_pose_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyPoseData(cPtr, false);
  }

  public void setMaterials(SWIGTYPE_p_p_SoftBodyMaterialData value) {
    gdxBulletJNI.btSoftBodyFloatData_materials_set(swigCPtr, this, SWIGTYPE_p_p_SoftBodyMaterialData.getCPtr(value));
  }

  public SWIGTYPE_p_p_SoftBodyMaterialData getMaterials() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_materials_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_SoftBodyMaterialData(cPtr, false);
  }

  public void setNodes(SoftBodyNodeData value) {
    gdxBulletJNI.btSoftBodyFloatData_nodes_set(swigCPtr, this, SoftBodyNodeData.getCPtr(value), value);
  }

  public SoftBodyNodeData getNodes() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_nodes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyNodeData(cPtr, false);
  }

  public void setLinks(SoftBodyLinkData value) {
    gdxBulletJNI.btSoftBodyFloatData_links_set(swigCPtr, this, SoftBodyLinkData.getCPtr(value), value);
  }

  public SoftBodyLinkData getLinks() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_links_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyLinkData(cPtr, false);
  }

  public void setFaces(SoftBodyFaceData value) {
    gdxBulletJNI.btSoftBodyFloatData_faces_set(swigCPtr, this, SoftBodyFaceData.getCPtr(value), value);
  }

  public SoftBodyFaceData getFaces() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_faces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyFaceData(cPtr, false);
  }

  public void setTetrahedra(SoftBodyTetraData value) {
    gdxBulletJNI.btSoftBodyFloatData_tetrahedra_set(swigCPtr, this, SoftBodyTetraData.getCPtr(value), value);
  }

  public SoftBodyTetraData getTetrahedra() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_tetrahedra_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyTetraData(cPtr, false);
  }

  public void setAnchors(SoftRigidAnchorData value) {
    gdxBulletJNI.btSoftBodyFloatData_anchors_set(swigCPtr, this, SoftRigidAnchorData.getCPtr(value), value);
  }

  public SoftRigidAnchorData getAnchors() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_anchors_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftRigidAnchorData(cPtr, false);
  }

  public void setClusters(SoftBodyClusterData value) {
    gdxBulletJNI.btSoftBodyFloatData_clusters_set(swigCPtr, this, SoftBodyClusterData.getCPtr(value), value);
  }

  public SoftBodyClusterData getClusters() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_clusters_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyClusterData(cPtr, false);
  }

  public void setJoints(btSoftBodyJointData value) {
    gdxBulletJNI.btSoftBodyFloatData_joints_set(swigCPtr, this, btSoftBodyJointData.getCPtr(value), value);
  }

  public btSoftBodyJointData getJoints() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_joints_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btSoftBodyJointData(cPtr, false);
  }

  public void setNumMaterials(int value) {
    gdxBulletJNI.btSoftBodyFloatData_numMaterials_set(swigCPtr, this, value);
  }

  public int getNumMaterials() {
    return gdxBulletJNI.btSoftBodyFloatData_numMaterials_get(swigCPtr, this);
  }

  public void setNumNodes(int value) {
    gdxBulletJNI.btSoftBodyFloatData_numNodes_set(swigCPtr, this, value);
  }

  public int getNumNodes() {
    return gdxBulletJNI.btSoftBodyFloatData_numNodes_get(swigCPtr, this);
  }

  public void setNumLinks(int value) {
    gdxBulletJNI.btSoftBodyFloatData_numLinks_set(swigCPtr, this, value);
  }

  public int getNumLinks() {
    return gdxBulletJNI.btSoftBodyFloatData_numLinks_get(swigCPtr, this);
  }

  public void setNumFaces(int value) {
    gdxBulletJNI.btSoftBodyFloatData_numFaces_set(swigCPtr, this, value);
  }

  public int getNumFaces() {
    return gdxBulletJNI.btSoftBodyFloatData_numFaces_get(swigCPtr, this);
  }

  public void setNumTetrahedra(int value) {
    gdxBulletJNI.btSoftBodyFloatData_numTetrahedra_set(swigCPtr, this, value);
  }

  public int getNumTetrahedra() {
    return gdxBulletJNI.btSoftBodyFloatData_numTetrahedra_get(swigCPtr, this);
  }

  public void setNumAnchors(int value) {
    gdxBulletJNI.btSoftBodyFloatData_numAnchors_set(swigCPtr, this, value);
  }

  public int getNumAnchors() {
    return gdxBulletJNI.btSoftBodyFloatData_numAnchors_get(swigCPtr, this);
  }

  public void setNumClusters(int value) {
    gdxBulletJNI.btSoftBodyFloatData_numClusters_set(swigCPtr, this, value);
  }

  public int getNumClusters() {
    return gdxBulletJNI.btSoftBodyFloatData_numClusters_get(swigCPtr, this);
  }

  public void setNumJoints(int value) {
    gdxBulletJNI.btSoftBodyFloatData_numJoints_set(swigCPtr, this, value);
  }

  public int getNumJoints() {
    return gdxBulletJNI.btSoftBodyFloatData_numJoints_get(swigCPtr, this);
  }

  public void setConfig(SoftBodyConfigData value) {
    gdxBulletJNI.btSoftBodyFloatData_config_set(swigCPtr, this, SoftBodyConfigData.getCPtr(value), value);
  }

  public SoftBodyConfigData getConfig() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_config_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyConfigData(cPtr, false);
  }

  public btSoftBodyFloatData() {
    this(gdxBulletJNI.new_btSoftBodyFloatData(), true);
  }

}
