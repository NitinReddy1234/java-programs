class DepartmentUtil
{
	public static void main(String a[])
	{
		Department department=new Department();
		System.out.println(department.universityName);
		System.out.println(department.collegeName);
		System.out.println(department.departmentName);
		
		department.noOfColleges();
		department.noOfStudents();
		department.noOfFaculties();
	}
}